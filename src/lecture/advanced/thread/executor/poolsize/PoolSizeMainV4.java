package lecture.advanced.thread.executor.poolsize;

import lecture.advanced.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static lecture.advanced.thread.executor.ExecutorUtils.printState;
import static lecture.advanced.util.MyLogger.log;

public class PoolSizeMainV4 {
    static final int TASK_SIZE = 1100;
//    static final int TASK_SIZE = 1200;
//    static final int TASK_SIZE = 1201;

    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(100, 200, 60,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(1_000));
        printState(es);

        long startMs = System.currentTimeMillis();
        for (int i = 0; i < TASK_SIZE; i++) {
            String taskName = "task" + i;
            try {
                es.execute(new RunnableTask(taskName));
                printState(es, taskName);
            } catch (RejectedExecutionException e) {
                log(taskName + " -> " + e);
            }
        }
        es.close();
        long endMs = System.currentTimeMillis();
        System.out.println("Time: " + (endMs - startMs));
    }
}
