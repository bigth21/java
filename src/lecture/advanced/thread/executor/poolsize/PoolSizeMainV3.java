package lecture.advanced.thread.executor.poolsize;

import lecture.advanced.thread.executor.RunnableTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static lecture.advanced.thread.executor.ExecutorUtils.printState;
import static lecture.advanced.util.MyLogger.log;

public class PoolSizeMainV3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
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
