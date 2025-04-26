import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class HTTPClient {

    public static final int PORT = 80;
    public static String SERVER_ADDR = "127.0.0.1" ; // "www.google.com";  // change: removed final
    public static final String CRLF = "\r\n";
    public static final String EOH = CRLF + CRLF;
    public static final Charset ENCODING = StandardCharsets.ISO_8859_1; // encoding to use for reading/writing data

    public static final int CHUNK_SIZE = 512;				// size of fragment to process


    public static void main(String[] args) {
        if (args.length > 2 || args.length < 1) throw new IllegalArgumentException("Arguments: server_addr [filepath]");

        SERVER_ADDR = args[0];
        String filePath = "";
        if (args.length == 2) filePath = args[1];

        System.out.println("client is requesting ... ");
        try {
            Socket socket = new Socket(SERVER_ADDR, PORT);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(dataOutputStream, ENCODING));
            BufferedReader reader = new BufferedReader(new InputStreamReader(dataInputStream, ENCODING));

            // Send HTTP request
            System.out.println("Sending HTTP request...");
            printWriter.print("GET /" + filePath + " HTTP/1.1" + CRLF);
            printWriter.print("Host: " + SERVER_ADDR + CRLF);
            printWriter.print("Connection: close" + CRLF);
            printWriter.print("Accept: */*" + EOH);
            printWriter.flush();

            System.out.println("Sent HTTP request");
            System.out.println();

            // Receive and parse HTTP response
            System.out.println("Receiving HTTP response...");
            StringBuilder stringBuilder = new StringBuilder();
            do {
                char c = (char) reader.read();
                stringBuilder.append(c);
                // System.out.println("  String: " + stringBuilder.toString());
            } while (!stringBuilder.toString().contains(EOH));
            String header = stringBuilder.toString();
            System.out.println(header);

            // 404
            if (header.contains("404")) {
                System.out.println("Error: " + header);
                dataInputStream.close();
                dataOutputStream.close();
                reader.close();
                printWriter.close();
                return;
            }

            // Get contentLength if there is one
            System.out.println("Determining Content-Length...");
            String[] headerLines = header.split(CRLF);
            int contentLength = -1;
            for (String headerLine : headerLines) {
                if (headerLine.toLowerCase().contains("content-length")) {
                    contentLength = Integer.parseInt(headerLine.split(": ")[1]);
                    break;
                }
            }

            // Read file
            System.out.println("Reading HTTP response body...");
            char[] buffer;

            // If content-length is not given in HTTP response header
            if (contentLength < 0) {
                // Find contentLength
                // HINT: If the content length is not given in the HTTP respond's header,
                // use while((N_bytes = reader.read(buffer, 0, CHUNK_SIZE)) != -1 ){}
                // the following is equivalent
                contentLength = 0;
                char[] tempBuffer = new char[CHUNK_SIZE];
                while (true) {
                    int numCharsRead = reader.read(tempBuffer, contentLength, CHUNK_SIZE);  // assuming reader reads with memory
                    //System.out.println("tempBuffer: " + new String(tempBuffer));
                    System.out.println("numCharsRead: " + numCharsRead);
                    if (numCharsRead == -1) break;
                    contentLength += numCharsRead;
                    // grow tempBuffer with every read until the end of file
                    char[] bigBuffer = new char[contentLength+CHUNK_SIZE];
                    System.arraycopy(tempBuffer, 0, bigBuffer, 0, contentLength);
                    tempBuffer = bigBuffer;
                }

                // Copy content to buffer of length contentLength
                buffer = new char[contentLength];
                System.arraycopy(tempBuffer, 0, buffer, 0, contentLength);
                //System.out.println("buffer: " + new String(buffer));
            } else {  // if content-length is given
                buffer = new char[contentLength];
                int totalCharsRead = 0;
                // read the file fully (address propagation delay)
                while (totalCharsRead < contentLength) {
                    int numCharsLeft = contentLength - totalCharsRead;
                    int numCharsRead = reader.read(buffer, totalCharsRead, Math.min(numCharsLeft, CHUNK_SIZE));  // avoid IndexOutOfBoundException
                    if (numCharsRead == -1) break;
                    totalCharsRead += numCharsRead;
                    //System.out.println("numCharsRead: " + numCharsRead + "; totalCharsRead: " + totalCharsRead);
                }
                System.out.println("Content-Length: " + contentLength + "; totalCharsRead: " + totalCharsRead);
            }

            System.out.println("content-length: " + contentLength + "; totalCharsRead: " + buffer.length);
            System.out.println("Saving HTTP response body...");
            //String bodyStr = new String(new String(buffer).getBytes(ENCODING), ENCODING);
            String bodyStr = new String(buffer);  // concatenates chars; don't worry about ENCODING
            //System.out.println("bodyStr: " + bodyStr);

            // Create / overwrite file with name passed as argument
            if (filePath.isEmpty()) {
                filePath = "index.html";
            } else if (filePath.contains("/")) {  // macOS
                String[] pathArray = filePath.split("/");
                filePath = pathArray[pathArray.length-1];
            } else if (filePath.contains("\\")) { // Windows
                String[] pathArray = filePath.split("\\\\");
                filePath = pathArray[pathArray.length-1];
            }
            File file = new File("client_folder", filePath);
            if (file.createNewFile()) System.out.println("Creating " + filePath);
            else System.out.println("Overwriting " + filePath);

            // Write to file
            FileWriter fileWriter = new FileWriter(file, ENCODING, false);
            fileWriter.write(bodyStr);
            System.out.println("Saved File: " + filePath);

            // De-initialization
            dataInputStream.close();
            dataOutputStream.close();
            reader.close();
            printWriter.close();
            fileWriter.close();

        } catch(UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
