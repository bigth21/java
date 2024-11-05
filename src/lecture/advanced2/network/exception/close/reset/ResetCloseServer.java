package lecture.advanced2.network.exception.close.reset;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static lecture.advanced2.util.MyLogger.log;

public class ResetCloseServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();
        log("Socket connected");
        socket.close();
        serverSocket.close();
        log("Socket closed");
    }
}
