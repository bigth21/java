package lecture.advanced2.chat.server.command;

import lecture.advanced2.chat.server.Session;
import lecture.advanced2.chat.server.SessionManager;

import java.io.IOException;
import java.util.List;

public class ChangeCommand implements Command {
    private final SessionManager sessionManager;

    public ChangeCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) {
        sessionManager.sendAll(session.getUsername() + " changed username to " + args[1]);
        session.setUsername(args[1]);
    }
}
