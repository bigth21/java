package lecture.advanced2.was.v3;

import lecture.advanced2.was.v2.HttpServerV2;

import java.io.IOException;

public class ServerMainV3 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        HttpServerV3 server = new HttpServerV3(PORT);
        server.start();
    }
}