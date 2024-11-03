package lecture.advanced2.network.tcp.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static lecture.advanced2.util.MyLogger.log;

public class ServerV1 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("Server start");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("Server socket started - listening on port " + PORT);

        Socket socket = serverSocket.accept();
        log("Socket connected - " + socket);

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        String received = dis.readUTF();
        log("Client -> Server : " + received);

        String toSend = received + " World!";
        dos.writeUTF(toSend);
        log("Client <- Server : " + toSend);

        dis.close();
        dos.close();
        socket.close();
        serverSocket.close();
        log("Connection closed: " + socket);
        log("Server end");
    }
}
