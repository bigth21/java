package lecture.advanced1.thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static lecture.advanced1.util.MyLogger.log;

public class BoundedQueueV1 implements BoundedQueue {
    private final Queue<String> queue = new ArrayDeque<>();
    private final int capacity;

    public BoundedQueueV1(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public synchronized void put(String data) {
        if (queue.size() == capacity) {
            log("Full: " + data);
            return;
        }
        queue.offer(data);
    }

    @Override
    public synchronized String take() {
        return queue.isEmpty() ? null : queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
