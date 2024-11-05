package lecture.advanced2.network.tcp.v5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static lecture.advanced2.util.MyLogger.log;

public class ServerV5 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("Server start");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("Server socket started - listening on port " + PORT);

        while (true) {
            Socket socket = serverSocket.accept();
            log("Socket connected - " + socket);

            SessionV5 session = new SessionV5(socket);
            Thread thread = new Thread(session);
            thread.start();
        }
    }
}
