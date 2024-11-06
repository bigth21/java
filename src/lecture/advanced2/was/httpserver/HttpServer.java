package lecture.advanced2.was.httpserver;

import lecture.advanced2.was.v4.HttpRequestHandlerV4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static lecture.advanced2.util.MyLogger.log;

public class HttpServer {
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);
    private final int port;
    private final ServletManager servletManager;

    public HttpServer(int port, ServletManager servletManager) {
        this.port = port;
        this.servletManager = servletManager;
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        log("Server starts");

        while (true) {
            Socket socket = serverSocket.accept();
            executorService.submit(new HttpRequestHandler(socket, servletManager));
        }
    }
}
