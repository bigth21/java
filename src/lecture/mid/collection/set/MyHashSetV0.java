package lecture.mid.collection.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elements = new int[10];
    private int size = 0;

    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        elements[size++] = value;
        return true;
    }

    public boolean contains(int value) {
        for (int e : elements) {
            if (e == value) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elements=" + Arrays.toString(Arrays.copyOf(elements, size)) +
                ", size=" + size +
                '}';
    }
}
