package lecture.advanced2.network.tcp.v5;

import lecture.advanced2.network.tcp.SocketCloseUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static lecture.advanced2.util.MyLogger.log;

public class SessionV5 implements Runnable {
    private final Socket socket;

    public SessionV5(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // To access variables in finally block.
        try (socket;
             DataInputStream dis = new DataInputStream(socket.getInputStream());
             DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {


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
        } catch (IOException e) {
            log(e);
        }
        log("Connection closed: " + socket + " isClosed: " + socket.isClosed());
    }
}
