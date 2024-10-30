package lecture.advanced1.thread.bounded;

import static lecture.advanced1.util.MyLogger.log;

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
