package lecture.intermediate.collection.comparable;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        MyUser[] array = {user1, user2, user3};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }
}
