package lecture.intermediate.collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elements;
    private int size = 0;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        if (size == elements.length) {
            elements = grow();
        }
        elements[size++] = e;
    }

    @Override
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

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elements[index];
    }

    @Override
    public E set(int index, E e) {
        E old = get(index);
        elements[index] = e;
        return old;
    }

    @Override
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o)
                return i;
        }
        return -1;
    }

    @Override
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
