import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

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
                }
            }

            // Read file
            System.out.println("Reading HTTP response body...");
            char[] buffer;
            int numCharsRead;

            // if content-length is not given in HTTP response header
            if (contentLength < 0) {
                // HINT: If the content length is not given in the HTTP respond's header,
                // use while((N_bytes = reader.read(buffer, 0, CHUNK_SIZE)) != -1 ){}
                // ...
                contentLength = 0;
                while (true) {
                    // grow array with every read until the end of file
                    // TODO: deal with extra space in array
                    buffer = new char[contentLength+CHUNK_SIZE];
                    int n_chars = reader.read(buffer, 0, CHUNK_SIZE);  // assuming reader reads with memory
                    if (n_chars == -1) break;
                    contentLength += n_chars;
                }
            } else {  // if content-length is given
                buffer = new char[contentLength];
                numCharsRead = reader.read(buffer);
                System.out.println("Content-Length: " + contentLength + "; numCharsRead: " + numCharsRead);  // DEBUG

                // TODO: Content-Length: 125540; numCharsRead: 32768
                // real content-length == 124667, as found with python len...

            }

            // Convert char[] to String (Array.toString()) is in array formatting...)
            System.out.println("Saving HTTP response body...");
            stringBuilder = new StringBuilder();
            for (char c : buffer) {
                // if (c == '\0') break;
                stringBuilder.append(c);
            }
            String bodyStr = stringBuilder.toString();

            // Create / overwrite file with name passed as argument
            if (filePath.isEmpty()) filePath = "index.html";
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
