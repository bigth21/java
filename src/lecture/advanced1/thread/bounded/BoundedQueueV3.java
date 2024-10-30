package lecture.advanced1.thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static lecture.advanced1.util.MyLogger.log;

public class BoundedQueueV3 implements BoundedQueue {
    private final Queue<String> queue = new ArrayDeque<>();
    private final int capacity;

    public BoundedQueueV3(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public synchronized void put(String data) {
        while (queue.size() == capacity) {
            log("Full, wait: " + data);
            try {
                wait();
                log("Awake");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(data);
        log("Notify");
        notify();
    }

    @Override
    public synchronized String take() {
        while (queue.isEmpty()) {
            log("No data, wait");
            try {
                wait();
                log("Awake");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String data = queue.poll();
        log("Notify");
        notify();
        return data;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
