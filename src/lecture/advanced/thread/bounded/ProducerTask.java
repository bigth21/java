package lecture.advanced.thread.bounded;

import static lecture.advanced.util.MyLogger.log;

public class ProducerTask implements Runnable {
    private BoundedQueue queue;
    private String data;

    public ProducerTask(BoundedQueue queue, String data) {
        this.queue = queue;
        this.data = data;
    }

    @Override
    public void run() {
        log("Start producer " + data + " -> " + queue);
        queue.put(data);
        log("End producer " + data + " -> " + queue);
    }
}
