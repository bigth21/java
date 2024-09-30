package algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ArrayDequeMain {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        System.out.println("stack = " + stack);
        stack.push(2);
        System.out.println("stack = " + stack);
        stack.push(3);
        System.out.println("stack = " + stack);
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
    }
}
