package lecture.intermediate.collection.arraylist;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        int number = 3;
        addFirst(arr, number);
        System.out.println(Arrays.toString(arr));

        int index = 2;
        number = 4;
        addAtIndex(arr, number, index);
        System.out.println(Arrays.toString(arr));

        number = 5;
        addLast(arr, number);
        System.out.println(Arrays.toString(arr));
    }

    private static void addFirst(int[] arr, int number) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = number;
    }

    private static void addAtIndex(int[] arr, int number, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = number;
    }

    private static void addLast(int[] arr, int number) {
        arr[arr.length - 1] = number;
    }
}
