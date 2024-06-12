package lecture.mid.collection.comparable;

import java.util.Arrays;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] arr = {3, 2, 1};
        System.out.println("arr = " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
