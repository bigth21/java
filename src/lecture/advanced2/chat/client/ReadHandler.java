package lecture.advanced2.chat.client;

import java.io.DataInputStream;
import java.io.IOException;

import static lecture.advanced2.util.MyLogger.log;

public class ReadHandler implements Runnable{
    private final DataInputStream inputStream;
    private final Client client;
    private boolean closed = false;

    public ReadHandler(DataInputStream inputStream, Client client) {
        this.inputStream = inputStream;
        this.client = client;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String received = inputStream.readUTF();
                System.out.println(received);
            }
        } catch (IOException e) {
            log(e);
        } finally {
            client.close();
        }
    }

    public synchronized void close() {
        if (closed) {
            return;
        }
        closed = true;
        log("ReadHandler closed");
    }
}
