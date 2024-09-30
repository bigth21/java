package algorithm.stack;

import java.util.Arrays;

public class MyStack {
    int[] values;
    int capacity = 10;
    int size;

    public MyStack() {
        this.values = new int[capacity];
        this.size = 0;
    }

    public void push(int value) {
        values[size++] = value;
        if (size > capacity / 2) {
            values = Arrays.copyOf(values, capacity * 2);
        }
    }

    public int pop() {
        if (size == 0)
            return -1;
        return values[--size];
    }
}
