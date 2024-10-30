package lecture.advanced1.thread.executor.future;

import lecture.advanced1.thread.executor.CallableTask;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static lecture.advanced1.util.MyLogger.log;

public class InvokeAnyMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        CallableTask task1 = new CallableTask("task1", 1000);
        CallableTask task2 = new CallableTask("task2", 1000);
        CallableTask task3 = new CallableTask("task3", 1000);

        Integer result = es.invokeAny(List.of(task1, task2, task3));
        log("value= " + result);
        es.close();
    }
}
