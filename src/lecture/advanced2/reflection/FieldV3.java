package lecture.advanced2.reflection;

import lecture.advanced2.reflection.data.Team;
import lecture.advanced2.reflection.data.User;

public class FieldV3 {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("id1", null, 1);
        Team team = new Team("id1", null);

        System.out.println("user = " + user);
        System.out.println("team = " + team);

        FieldUtils.nullFieldToDefault(user);
        FieldUtils.nullFieldToDefault(team);

        System.out.println("user = " + user);
        System.out.println("team = " + team);
    }
}
