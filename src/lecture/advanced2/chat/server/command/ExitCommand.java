package lecture.advanced2.chat.server.command;

import lecture.advanced2.chat.server.Session;
import lecture.advanced2.chat.server.SessionManager;

import java.io.IOException;

public class ExitCommand implements Command {
    private final SessionManager sessionManager;

    public ExitCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) throws IOException {
        throw new IOException("exit");
    }
}
