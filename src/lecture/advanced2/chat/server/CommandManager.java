package lecture.advanced2.chat.server;

import java.io.IOException;

public interface CommandManager {
    void execute(String message, Session session) throws IOException;
}
