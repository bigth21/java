package lecture.advanced2.chat.server.command;

import lecture.advanced2.chat.server.Session;

import java.io.IOException;
import java.util.Arrays;

public class DefaultCommand implements Command {
    @Override
    public void execute(String[] args, Session session) throws IOException {
        session.send("Unknown command: " + Arrays.toString(args));
    }
}