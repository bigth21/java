package lecture.intermediate.collection.arraylist;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elements;
    private int size = 0;

    public MyArrayListV1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int capacity) {
        elements = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        elements[size++] = e;
    }

    public Object get(int index) {
        return elements[index];
    }

    public Object set(int index, Object e) {
        Object old = elements[index];
        elements[index] = e;
        return old;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o)
                return i;
        }
        return -1;
    }

    public String toString() {
        return "elements=" + Arrays.toString(Arrays.copyOf(elements, size))  + ",size=" + size + ",capacity=" + elements.length;
    }
}