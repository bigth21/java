package lecture.advanced2.chat.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static lecture.advanced2.util.MyLogger.log;

public class WriteHandler implements Runnable {
    private static final String DELIMITER = "|";

    private final DataOutputStream outputStream;
    private final Client client;

    private boolean closed = false;

    public WriteHandler(DataOutputStream outputStream, Client client) {
        this.outputStream = outputStream;
        this.client = client;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            String username = promptUsername(scanner);
            outputStream.writeUTF("/join" + DELIMITER + username);

            while (true) {
                String toSend = scanner.nextLine();
                if (toSend.isEmpty()) {
                    continue;
                } else if (toSend.equals("/exit")) {
                    outputStream.writeUTF(toSend);
                    break;
                } else if (toSend.startsWith("/")) {
                    outputStream.writeUTF(toSend);
                } else {
                    outputStream.writeUTF("/message" + DELIMITER + toSend);
                }
            }
        } catch (IOException | NoSuchElementException e) {
            log(e);
        } finally {
            client.close();
        }
    }

    private static String promptUsername(Scanner scanner) {
        System.out.println("Enter username");
        String username;
        do {
            username = scanner.nextLine();
        } while (username.isEmpty());
        return username;
    }

    public synchronized void close() {
        if (closed) {
            return;
        }
        try {
            System.in.close();
        } catch (IOException e) {
            log(e);
        }
        closed = true;
        log("WriteHandler closed");
    }
}
