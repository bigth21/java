package algorithm.sort;

import java.util.Arrays;

public class MergeSortMain {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        MergeSort.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
