package lecture.advanced2.was.v3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static lecture.advanced2.util.MyLogger.log;

public class HttpServerV3 {
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);
    private final int port;

    public HttpServerV3(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        log("Server starts");

        while (true) {
            Socket socket = serverSocket.accept();
            executorService.submit(new HttpRequestHandlerV3(socket));
        }
    }
}
