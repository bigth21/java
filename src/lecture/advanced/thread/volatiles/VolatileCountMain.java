package lecture.advanced.thread.volatiles;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task);
        thread.start();

        sleep(1_000);

        task.flag = false;
        log("flag = " + task.flag + ", count = " + task.count);
    }

    static class MyTask implements Runnable {
        volatile boolean flag = true;
        long count;

        @Override
        public void run() {
            while (flag) {
                count++;
                if (count % 100_000_000 == 0) {
                    log("flag = " + flag + ", count = " + count);
                }
            }
            log("flag = " + flag + ", count = " + count);
        }
    }
}
