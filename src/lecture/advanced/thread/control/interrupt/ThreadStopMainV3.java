package lecture.advanced.thread.control.interrupt;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class ThreadStopMainV3 {
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
            while (!Thread.currentThread().isInterrupted()) {
                log("Proceeding");
            }

            try {
                log("Try resource clean up");
                Thread.sleep(1000);
                log("Resource clean up complete");
            } catch (InterruptedException e) {
                log("Resource clean up fail");
                log("Worker thread interrupted = " + Thread.currentThread().isInterrupted());
                log("Terminated");
            }
        }
    }
}
