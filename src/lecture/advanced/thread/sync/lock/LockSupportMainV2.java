package lecture.advanced.thread.sync.lock;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class LockSupportMainV2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new ParkText());
        thread.start();

        sleep(100);
        log("Thread state: " + thread.getState());
    }

    static class ParkText implements Runnable {

        @Override
        public void run() {
            log("Start park");
            LockSupport.parkNanos(2_000_000_000); // Not precise
            log("End park, state: " + Thread.currentThread().getState());
            log("Interrupted: " + Thread.currentThread().isInterrupted());
        }
    }
}
