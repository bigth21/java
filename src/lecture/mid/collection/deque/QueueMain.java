package lecture.mid.collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
//        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println("q = " + q);

        System.out.println("q.peek() = " + q.peek());

        System.out.println("q.poll() = " + q.poll());
        System.out.println("q.poll() = " + q.poll());
        System.out.println("q.poll() = " + q.poll());

        System.out.println("q = " + q);

    }
}
