package lecture.advanced.thread.bounded;

import static lecture.advanced.util.MyLogger.log;

public class ConsumerTask implements Runnable {
    private BoundedQueue queue;

    public ConsumerTask(BoundedQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        log("Start consumer ? <- " + queue);
        String data = queue.take();
        log("End consumer " + data + " <- " + queue);
    }
}
