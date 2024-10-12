package lecture.advanced.thread.volatiles;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task);
        log("runFlag = " + task.runFlag);
        thread.start();
        sleep(1000);
        task.runFlag = false;
        log("runFlag = " + task.runFlag);
        log("Terminated");

    }

    static class MyTask implements Runnable {
        volatile boolean runFlag = true;

        @Override
        public void run() {
            log("Task start");
            while (runFlag) {

            }
            log("Task end");
        }
    }
}
