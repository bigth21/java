package lecture.advanced1.thread.control.interrupt;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class ThreadStopMainV4 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "worker-1");
        thread.start();

        sleep(100);
        log("Stop work");
        thread.interrupt();
        log("Worker thread interrupted = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            while (!Thread.interrupted()) {
                log("Proceeding");
            }

            log("Worker thread interrupted = " + Thread.currentThread().isInterrupted());

            try {
                log("Try resource clean up");
                Thread.sleep(1000);
                log("Resource clean up complete");

            } catch (InterruptedException e) {
                log("Resource clean up fail");
            } finally {
                log("Worker thread interrupted = " + Thread.currentThread().isInterrupted());
                log("Terminated");
            }
        }
    }
}
