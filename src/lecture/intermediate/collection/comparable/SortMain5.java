package lecture.intermediate.collection.comparable;

import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        Set<MyUser> users1 = new TreeSet<>();
        users1.add(user1);
        users1.add(user2);
        users1.add(user3);
        System.out.println("users = " + users1);

        Set<MyUser> users2 = new TreeSet<>(new IdComparator());
        users2.add(user1);
        users2.add(user2);
        users2.add(user3);
        System.out.println("users2 = " + users2);
    }
}
