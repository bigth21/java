package lecture.advanced2.network.exception.close.normal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static lecture.advanced2.util.MyLogger.log;

public class NormalCloseServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket socket = serverSocket.accept();
        log("Socket connected");
        Thread.sleep(1_000);
        socket.close();
        log("Socket closed");
    }
}
