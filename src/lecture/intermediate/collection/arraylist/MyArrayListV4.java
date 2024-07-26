package lecture.intermediate.collection.arraylist;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elements;
    private int size = 0;

    public MyArrayListV4() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int capacity) {
        elements = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        if (size == elements.length) {
            elements = grow();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
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

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elements[index];
    }

    public E set(int index, E e) {
        E old = get(index);
        elements[index] = e;
        return old;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o)
                return i;
        }
        return -1;
    }

    public E remove(int index) {
        E removed = get(index);
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
