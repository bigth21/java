package lecture.advanced2.network.tcp.v2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static lecture.advanced2.util.MyLogger.log;

public class ClientV2 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("Client start");
        Socket socket = new Socket("localhost", PORT);
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        log("Client connected - " + socket);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter text to send: ");
            String toSend = scanner.nextLine();

            dos.writeUTF(toSend);
            log("Client -> Server : " + toSend);

            if (toSend.equals("exit")) {
                break;
            }

            String received = dis.readUTF();
            log("Client <- Server : " + received);
        }

        dis.close();
        dos.close();
        socket.close();
        log("Connection closed: " + socket);
        log("Client end");
    }
}
