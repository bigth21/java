package lecture.mid.collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class MyHashSetV2 {
    private static final int DEFAULT_CAPACITY = 10;

    LinkedList<Object>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int index = hash(value);
        LinkedList<Object> bucket = buckets[index];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object value) {
        int index = hash(value);
        LinkedList<Object> bucket = buckets[index];
        return bucket.contains(value);
    }

    public boolean remove(Object value) {
        int index = hash(value);
        LinkedList<Object> bucket = buckets[index];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    private int hash(Object value) {
        return Math.abs(value.hashCode()) % capacity;
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
