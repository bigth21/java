package lecture.advanced2.chat.server.command;

import lecture.advanced2.chat.server.Session;
import lecture.advanced2.chat.server.SessionManager;

public class JoinCommand implements Command {
    private final SessionManager sessionManager;

    public JoinCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) {
        session.setUsername(args[1]);
        sessionManager.sendAll(args[1] + " joined the chat");
    }
}
