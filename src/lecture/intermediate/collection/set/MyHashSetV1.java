package lecture.intermediate.collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    private static final int DEFAULT_CAPACITY = 10;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int index = hash(value);
        LinkedList<Integer> bucket = buckets[index];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int value) {
        int index = hash(value);
        LinkedList<Integer> bucket = buckets[index];
        return bucket.contains(value);
    }

    public boolean remove(int value) {
        int index = hash(value);
        LinkedList<Integer> bucket = buckets[index];
        boolean result = bucket.remove(Integer.valueOf(value));
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hash(int value) {
        return value % DEFAULT_CAPACITY;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
