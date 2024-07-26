package lecture.intermediate.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart4 {
    private static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("numbers = " + Arrays.toString(buckets));

        int targetNumber = 99;
        System.out.println("contains(buckets, targetNumber) = " + contains(buckets, targetNumber));
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {
        int index = hash(value);
        LinkedList<Integer> bucket = buckets[index];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int value) {
        int index = hash(value);
        LinkedList<Integer> bucket = buckets[index];
        return bucket.contains(value);
    }

    private static int hash(int value) {
        return value % CAPACITY;
    }
}
