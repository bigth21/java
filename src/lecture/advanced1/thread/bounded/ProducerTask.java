package lecture.advanced1.thread.bounded;

import static lecture.advanced1.util.MyLogger.log;

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
