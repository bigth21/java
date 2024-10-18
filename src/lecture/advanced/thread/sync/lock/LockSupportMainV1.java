package lecture.advanced.thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class LockSupportMainV1 {

    public static void main(String[] args) {
        Thread thread = new Thread(new ParkText());
        thread.start();

        sleep(100);
        log("Thread state: " + thread.getState());

        log("Unpark thread");
        LockSupport.unpark(thread);
//        thread.interrupt();

    }

    static class ParkText implements Runnable {

        @Override
        public void run() {
            log("Start park");
            LockSupport.park();
            log("End park, state: " + Thread.currentThread().getState());
            log("Interrupted: " + Thread.currentThread().isInterrupted());
        }
    }
}
