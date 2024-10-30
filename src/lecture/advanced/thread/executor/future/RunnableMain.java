package lecture.advanced.thread.executor.future;

import java.util.Random;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class RunnableMain {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable task = new MyRunnable();
        Thread thread = new Thread(task);
        thread.start();
        thread.join();
        int result = task.value;
        log("result=" + result);
    }

    static class MyRunnable implements Runnable {
        int value;

        @Override
        public void run() {
            log("Start");
            sleep(2_000);
            value = new Random().nextInt(10);
            log("End");
        }
    }
}
