package lecture.advanced.thread.control.interrupt;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class ThreadStopMainV2 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "worker-1");
        thread.start();

        sleep(4000);
        log("Stop work");
        thread.interrupt();
        log("Worker thread interrupted = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    log("Proceeding");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                log("Worker thread interrupted = " + Thread.currentThread().isInterrupted());
                log(e.getMessage());
                log("State = " + Thread.currentThread().getState());
            }
            log("Clean up resource");
            log("Terminated");
        }
    }
}
