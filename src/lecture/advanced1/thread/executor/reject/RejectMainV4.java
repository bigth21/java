package lecture.advanced1.thread.executor.reject;

import lecture.advanced1.thread.executor.RunnableTask;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static lecture.advanced1.util.MyLogger.log;

public class RejectMainV4 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0,
                TimeUnit.SECONDS, new SynchronousQueue<>(), new MyRejectedExecutionHandler());
        executor.submit(new RunnableTask("task1"));
        executor.submit(new RunnableTask("task2"));
        executor.submit(new RunnableTask("task3"));
        executor.submit(new RunnableTask("task4"));
        executor.close();
    }

    static class MyRejectedExecutionHandler implements RejectedExecutionHandler {
        static AtomicInteger count = new AtomicInteger();

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            int i = count.incrementAndGet();
            log("The number of rejected tasks: " + i);
        }
    }
}