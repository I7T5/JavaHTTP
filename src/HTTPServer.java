import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class HTTPServer {

    public static final int PORT = 80;
    public static final String IP = "127.0.0.1";
    public static final String CRLF = "\r\n";
    public static final String EOH = CRLF + CRLF;
    public static final Charset ENCODING = StandardCharsets.ISO_8859_1; // encoding to use for reading/writing

    public static void main(String[] args){

        System.out.println("server is listening to port 80");
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);

            while (true) {

                Socket socket = serverSocket.accept();
                System.out.println("get connection from IP: " + socket.getRemoteSocketAddress());

                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

                BufferedReader reader = new BufferedReader(new InputStreamReader(dataInputStream, ENCODING));
                PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(dataOutputStream, ENCODING));

                // Read and parse HTTP request
                System.out.println("Reading and parsing HTTP request...");

                String reqStartLine = reader.readLine();
                System.out.println(reqStartLine);
                while (reqStartLine == null) {
                    reqStartLine = reader.readLine();
                }
                // TODO: why is startLine null when we request from 127.0.0.1 more than once consecutively?
//                String line = reader.readLine();
//                while (line != null) line = reader.readLine();

                //String reqHostLine = reader.readLine();
                // the rest of the lines doesn't really matter for our purposes...
                //System.out.println(reqStartLine);
                String filepath = reqStartLine.split(" ")[1];
                if (filepath.equals("/")) filepath = "/index.html";

                // Find file and put together HTTP response pieces
                System.out.println("Looking for file...");
                String body;
                String resMsg;
                String contentType;
                try {
                    // Check if file exists
                    File file = new File("server_folder" + filepath);
                    System.out.println("File found: " + filepath);  // DEBUG
                    // Hint: use
                    // String body = new String(Files.readAllBytes(file.toPath()), ENCODING);
                    // to read a file and convert it into a string
                    // the following is equivalent Intellij suggestion
                    body = Files.readString(file.toPath(), ENCODING);  // convert file to string
                    resMsg = "OK";
                    contentType = Files.probeContentType(file.toPath());  // https://www.baeldung.com/java-file-mime-type
                } catch (Exception e) {
                    body = "File does not exist 404";
                    resMsg = "404 Not Found";
                    contentType = "text/html";
                }

                // Construct and send back HTTP response
                System.out.println("Sending HTTP response...");
                printWriter.print("HTTP/1.1 " + resMsg + CRLF);
                printWriter.print("Content-Type: " + contentType + CRLF);
                printWriter.print("Connection: close" + CRLF);
                printWriter.print("Content-Length: " + body.length() + EOH);
                printWriter.print(body);
                printWriter.flush();

                System.out.println("Sent HTTP response");
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
