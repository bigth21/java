package algorithm.search.binarysearch;

import java.util.Arrays;

public class MyBinarySearch {
    public static void main(String[] args) {
        int[] input = {5, 4, 8, 2, 9, 1, 3, 7, 2, 6};
        int target= 9;
        boolean exist = binarySearch(input, target);
        System.out.println(exist);
    }

    private static boolean binarySearch(int[] input, int target) {
        Arrays.sort(input);
        int left = 0, right = input.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (input[mid] == target) {
                return true;
            } else if (input[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
