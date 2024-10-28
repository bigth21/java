package lecture.advanced.thread.cas.spinlock;

import java.util.concurrent.atomic.AtomicBoolean;

import static lecture.advanced.util.MyLogger.log;

public class SpinLock {
    private final AtomicBoolean lock = new AtomicBoolean(false);

    public void lock() {
        log("Try to acquire lock");
        while (!lock.compareAndSet(false, true)) {
            log("Waiting");
        }
        log("Lock acquired");
    }

    public void unLock() {
        lock.set(false);
        log("Release lock");
    }
}
