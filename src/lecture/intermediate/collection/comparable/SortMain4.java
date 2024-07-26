package lecture.intermediate.collection.comparable;

import java.util.Comparator;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        List<MyUser> list = new java.util.ArrayList<>(List.of(user1, user2, user3));
        System.out.println("list = " + list);

//        list.algorithm.sort(null);
        list.sort(Comparator.naturalOrder());
        System.out.println("list = " + list);

        list.sort(new IdComparator());
        System.out.println("list = " + list);
    }
}
