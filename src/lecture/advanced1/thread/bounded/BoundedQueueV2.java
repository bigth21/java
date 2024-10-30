package lecture.advanced1.thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class BoundedQueueV2 implements BoundedQueue {
    private final Queue<String> queue = new ArrayDeque<>();
    private final int capacity;

    public BoundedQueueV2(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public synchronized void put(String data) {
        while (queue.size() == capacity) {
            log("Full, wait: " + data);
            sleep(1000);
        }
        queue.offer(data);
    }

    @Override
    public synchronized String take() {
        if (queue.isEmpty()) {
            log("No data, wait");
            sleep(1000);
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
