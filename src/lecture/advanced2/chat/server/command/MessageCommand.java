package lecture.advanced2.chat.server.command;

import lecture.advanced2.chat.server.Session;
import lecture.advanced2.chat.server.SessionManager;

public class MessageCommand implements Command {
    private final SessionManager sessionManager;

    public MessageCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) {
        sessionManager.sendAll("[" + session.getUsername() + "] " + args[1]);
    }
}
