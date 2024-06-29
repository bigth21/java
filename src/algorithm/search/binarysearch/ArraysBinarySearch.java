package algorithm.search.binarysearch;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int[] input = {5, 4, 8, 2, 9, 1, 3, 7, 2, 6};
        int target= 9;
        Arrays.sort(input);
        System.out.println("input = " + Arrays.toString(input));

        int index = Arrays.binarySearch(input, target);
        System.out.println("pos = " + index);
    }
}
