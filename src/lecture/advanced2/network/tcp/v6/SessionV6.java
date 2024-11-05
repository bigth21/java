package lecture.advanced2.network.tcp.v6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static lecture.advanced2.network.tcp.SocketCloseUtil.closeAll;
import static lecture.advanced2.util.MyLogger.log;

public class SessionV6 implements Runnable {
    private final Socket socket;
    private final DataInputStream dis;
    private final DataOutputStream dos;
    private final SessionManagerV6 sessionManager;
    private boolean closed = false;

    public SessionV6(Socket socket, SessionManagerV6 sessionManager) throws IOException {
        this.socket = socket;
        this.dis = new DataInputStream(socket.getInputStream());
        this.dos = new DataOutputStream(socket.getOutputStream());
        this.sessionManager = sessionManager;
        this.sessionManager.add(this);
    }

    @Override
    public void run() {
        // To access variables in finally block.
        try {
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
        } finally {
            sessionManager.remove(this);
            close();
        }
    }

    public synchronized void close() {
        if (closed)
            return;
        closeAll(socket, dis, dos);
        closed = true;
        log("Connection closed: " + socket + " isClosed: " + socket.isClosed());
    }
}
