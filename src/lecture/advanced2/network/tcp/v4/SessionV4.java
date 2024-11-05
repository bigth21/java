package lecture.advanced2.network.tcp.v4;

import lecture.advanced2.network.tcp.SocketCloseUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static lecture.advanced2.util.MyLogger.log;

public class SessionV4 implements Runnable{
    private final Socket socket;

    public SessionV4(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // To access variables in finally block.
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());

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
            throw new RuntimeException(e);
        } finally {
            SocketCloseUtil.closeAll(socket, dis, dos);
            log("Connection closed: " + socket);
        }
    }
}
