package lecture.advanced.thread.executor;

import java.util.concurrent.Callable;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class CallableTask implements Callable<Integer> {
    private final String name;
    private int sleepMs = 1_000;

    public CallableTask(String name) {
        this.name = name;
    }

    public CallableTask(String name, int sleepMs) {
        this.name = name;
        this.sleepMs = sleepMs;
    }

    @Override
    public Integer call() throws Exception {
        log("Execute " + name);
        sleep(sleepMs);
        log("Terminate " + name);
        return sleepMs;
    }
}
