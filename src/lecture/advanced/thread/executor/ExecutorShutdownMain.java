package lecture.advanced.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static lecture.advanced.thread.executor.ExecutorUtils.printState;
import static lecture.advanced.util.MyLogger.log;

public class ExecutorShutdownMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(new RunnableTask("taskA"));
        es.execute(new RunnableTask("taskB"));
        es.execute(new RunnableTask("taskC"));
        es.execute(new RunnableTask("longTask", 100_000));
        printState(es);
        log("Start shutdown");
        shutdownAndAwaitTermination(es);
        log("Terminate shutdown");
        printState(es);
    }

    private static void shutdownAndAwaitTermination(ExecutorService es) {
        es.shutdown();
        try {
            log("Try graceful shutdown");
            if (!es.awaitTermination(10, java.util.concurrent.TimeUnit.SECONDS)) {
                log("Shutdown timed out");
                es.shutdownNow();
                if (!es.awaitTermination(10, java.util.concurrent.TimeUnit.SECONDS)) {
                    log("Service not terminated");
                }
            }
        } catch (InterruptedException ie) {
            es.shutdownNow();
        }
    }
}
