package lecture.advanced2.network.tcp.v3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static lecture.advanced2.util.MyLogger.log;

public class SessionV3 implements Runnable{
    private final Socket socket;

    public SessionV3(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String received = dis.readUTF();
                log("Client -> Server : " + received);

                if (received.equals("exit")) {
                    break;
                }

                String toSend = received + " World!";
                dos.writeUTF(toSend);
                log("Client <- Server : " + toSend);
            }

            dis.close();
            dos.close();
            socket.close();
            log("Connection closed: " + socket);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
