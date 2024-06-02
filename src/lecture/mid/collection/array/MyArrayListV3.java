package lecture.mid.collection.array;

import java.util.Arrays;

public class MyArrayListV3 {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elements;
    private int size = 0;

    public MyArrayListV3() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int capacity) {
        elements = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if (size == elements.length) {
            elements = grow();
        }
        elements[size++] = e;
    }

    public void add(int index, Object e) {
        if (size == elements.length) {
            elements = grow();
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
        size++;
    }

    private Object[] grow() {
        return Arrays.copyOf(elements, elements.length * 2);
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

    public Object remove(int index) {
        Object removed = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        elements[size] = null;
        return removed;
    }

    public String toString() {
        return "elements=" + Arrays.toString(Arrays.copyOf(elements, size))  + ",size=" + size + ",capacity=" + elements.length;
    }
}
