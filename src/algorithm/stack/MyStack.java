package algorithm.stack;

import java.util.Arrays;

public class MyStack {
    int[] elements;
    int capacity = 10;
    int size;

    public MyStack() {
        this.elements = new int[capacity];
        this.size = 0;
    }

    public void push(int element) {
        elements[size++] = element;
        if (size > capacity / 2) {
            elements = Arrays.copyOf(elements, capacity * 2);
        }
    }

    public int pop() {
        if (size == 0)
            return -1;
        return elements[--size];
    }
}
