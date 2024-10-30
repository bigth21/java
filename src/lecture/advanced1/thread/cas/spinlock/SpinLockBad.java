package lecture.advanced1.thread.cas.spinlock;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class SpinLockBad {
    private volatile boolean lock = false;

    public void lock() {
        log("Try to acquire lock");
        while (true) {
            if (!lock) {
                sleep(100);
                lock = true;
                break;
            } else {
                log("Waiting");
            }
        }
        log("Lock acquired");
    }

    public void unLock() {
        lock = false;
        log("Release lock");
    }
}
