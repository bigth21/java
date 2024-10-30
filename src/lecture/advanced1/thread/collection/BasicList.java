package lecture.advanced1.thread.collection;

import java.util.Arrays;

import static lecture.advanced1.util.ThreadUtils.sleep;

public class BasicList implements SimpleList{
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public BasicList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object e) {
        elements[size] = e;
        sleep(100);
        size++;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}
