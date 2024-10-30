package lecture.advanced1.thread.control.join;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class JoinMainV0 {
    public static void main(String[] args) {
        log("Start");
        Thread thread1 = new Thread(new Job(), "thread-1");
        Thread thread2 = new Thread(new Job(), "thread-2");

        thread1.start();
        thread2.start();
        log("End");
    }

    static class Job implements Runnable {
        @Override
        public void run() {
            log("Job starts");
            sleep(2000);
            log("Job end");
        }
    }
}
