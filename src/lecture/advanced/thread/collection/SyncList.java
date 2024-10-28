package lecture.advanced.thread.collection;

import java.util.Arrays;

import static lecture.advanced.util.ThreadUtils.sleep;

public class SyncList implements SimpleList{
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public SyncList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public synchronized int size() {
        return size;
    }

    @Override
    public synchronized void add(Object e) {
        elements[size] = e;
        sleep(100);
        size++;
    }

    @Override
    public synchronized Object get(int index) {
        return elements[index];
    }

    @Override
    public synchronized String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}
