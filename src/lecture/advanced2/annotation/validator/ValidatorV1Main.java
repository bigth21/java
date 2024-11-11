package lecture.advanced2.annotation.validator;

import static lecture.advanced2.util.MyLogger.log;

public class ValidatorV1Main {
    public static void main(String[] args) {
        User user = new User("user1", 0);
        Team team = new Team("", 0);

        try {
            validateUser(user);
        } catch (Exception e) {
            log(e);
        }

        try {
            validateTeam(team);
        } catch (Exception e) {
            log(e);
        }
    }

    private static void validateUser(User user) {
        if (user.getName() == null | user.getName().isEmpty()) {
            throw new RuntimeException("Name is empty");
        }
        if (user.getAge() < 1 || user.getAge() > 100) {
            throw new RuntimeException("Age is invalid");
        }
    }

    private static void validateTeam(Team team) {
        if (team.getName() == null | team.getName().isEmpty()) {
            throw new RuntimeException("Name is empty");
        }
        if (team.getMemberCount() < 1 || team.getMemberCount() > 999) {
            throw new RuntimeException("Member count is invalid");
        }
    }
}
