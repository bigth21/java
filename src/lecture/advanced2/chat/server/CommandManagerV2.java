package lecture.advanced2.chat.server;

import java.io.IOException;
import java.util.List;

public class CommandManagerV2 implements CommandManager {
    private static final String DELIMITER = "\\|";
    private final SessionManager sessionManager;

    public CommandManagerV2(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String message, Session session) throws IOException {
        if (message.startsWith("/join")) {
            String[] split = message.split(DELIMITER);
            String username = split[1];
            session.setUsername(username);
            sessionManager.sendAll(username + " joined the chat");
        } else if (message.startsWith("/message")) {
            String[] split = message.split(DELIMITER);
            String content = split[1];
            sessionManager.sendAll("[" + session.getUsername() + "] " + content);
        } else if (message.startsWith("/change")) {
            String[] split = message.split(DELIMITER);
            String newUsername = split[1];
            sessionManager.sendAll(session.getUsername() + " changed username to " + newUsername);
            session.setUsername(newUsername);
        } else if (message.startsWith("/users")) {
            List<String> usernames = sessionManager.getAllUsername();
            StringBuilder sb = new StringBuilder();
            sb.append("Total users: ").append(usernames.size()).append("\n");
            for (String username : usernames) {
                sb.append(" - ").append(username).append("\n");
            }
            session.send(sb.toString());
        } else if (message.startsWith("/exit")) {
            throw new IOException("exit");
        } else {
            session.send("Unprocessable command");
        }
    }
}
