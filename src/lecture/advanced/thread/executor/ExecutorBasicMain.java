package lecture.advanced.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import static lecture.advanced.thread.executor.ExecutorUtils.printState;
import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class ExecutorBasicMain {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(2, 2, 0,
                TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        log("==Initial State==");
        printState(es);
        es.execute(new RunnableTask("taskA"));
        es.execute(new RunnableTask("taskB"));
        es.execute(new RunnableTask("taskC"));
        es.execute(new RunnableTask("taskD"));
        log("==Executing==");
        printState(es);

        sleep(3_000);
        log("==End State==");
        printState(es);

        es.close();
        log("==Shutdown executor service==");
        printState(es);
    }
}
