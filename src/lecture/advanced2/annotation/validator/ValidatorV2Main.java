package lecture.advanced2.annotation.validator;

import static lecture.advanced2.util.MyLogger.log;

public class ValidatorV2Main {
    public static void main(String[] args) {
        User user = new User("user1", 0);
        Team team = new Team("", 0);

        try {
            Validator.validate(user);
        } catch (Exception e) {
            log(e);
        }

        try {
            Validator.validate(team);
        } catch (Exception e) {
            log(e);
        }
    }
}
