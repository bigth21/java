package lecture.intermediate.collection.arraylist;

import java.util.Arrays;

public class MyArrayListV2 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elements;
    private int size = 0;

    public MyArrayListV2() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV2(int capacity) {
        elements = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
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
