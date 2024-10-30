package lecture.advanced.thread.executor.poolsize;

import lecture.advanced.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static lecture.advanced.thread.executor.ExecutorUtils.printState;
import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class PoolSizeMainV2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
//        ThreadPoolExecutor es = new ThreadPoolExecutor(2, 2, 0L,
//                TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        log("Create pool");
        printState(es);

        for (int i = 0; i < 6; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        es.close();
        log("Close pool");
    }
}
