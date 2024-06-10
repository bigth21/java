package lecture.mid.collection.set;

import java.util.Arrays;

public class HashStart5 {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        System.out.println("hash(1) = " + hash(1));
        System.out.println("hash(2) = " + hash(2));
        System.out.println("hash(5) = " + hash(5));
        System.out.println("hash(8) = " + hash(8));
        System.out.println("hash(14) = " + hash(14));
        System.out.println("hash(99) = " + hash(99));

        Integer[] numbers = new Integer[CAPACITY];
        add(numbers, 1);
        add(numbers, 2);
        add(numbers, 5);
        add(numbers, 8);
        add(numbers, 14);
        add(numbers, 99);
        System.out.println("numbers = " + Arrays.toString(numbers));

        int targetNumber = 99;
        System.out.println("numbers[hash(targetNumber)] = " + numbers[hash(targetNumber)]);
    }

    private static void add(Integer[] arr, int value) {
        int index = hash(value);
        arr[index] = value;
    }

    private static int hash(int value) {
        return value % CAPACITY;
    }
}
