package lecture.advanced.thread.executor.future;

import lecture.advanced.thread.executor.CallableTask;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static lecture.advanced.util.MyLogger.log;

public class InvokeAllMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        CallableTask task1 = new CallableTask("task1", 1000);
        CallableTask task2 = new CallableTask("task2", 1000);
        CallableTask task3 = new CallableTask("task3", 1000);

        List<Future<Integer>> futures = es.invokeAll(List.of(task1, task2, task3));
        for (Future<Integer> future : futures) {
            Integer result = future.get();
            log("value= " + result);
        }
        es.close();
    }
}