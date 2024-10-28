package lecture.advanced.thread.cas.spinlock;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

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
