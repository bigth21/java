package lecture.advanced2.reflection;

import lecture.advanced2.reflection.data.User;

import java.lang.reflect.Field;

public class FieldV2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User("id1", "userA", 20);
        System.out.println("user.getName() = " + user.getName());

        Class<? extends User> clazz = user.getClass();
        Field nameField = clazz.getDeclaredField("name");

        nameField.setAccessible(true);
        nameField.set(user, "userB");
        System.out.println("user.getName() = " + user.getName());
    }
}