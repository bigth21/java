package lecture.advanced1.thread.control.interrupt;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class ThreadStopMainV1 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "worker-1");
        thread.start();

        sleep(4000);
        log("Stop work");
        task.runFlag = false;
    }

    static class MyTask implements Runnable {

        volatile boolean runFlag = true;

        @Override
        public void run() {
            while (runFlag) {
                log("Proceeding");
                sleep(3000);
            }
            log("Clean up resource");
            log("Terminated");
        }
    }
}
