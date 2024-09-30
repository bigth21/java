package algorithm.stack;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        System.out.println(stack.pop());
    }
}
