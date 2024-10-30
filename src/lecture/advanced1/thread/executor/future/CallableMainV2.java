package lecture.advanced1.thread.executor.future;

import java.util.Random;
import java.util.concurrent.*;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class CallableMainV2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        log("Invoke submit");
        Future<Integer> future = es.submit(new MyCallable());
        log("Future=" + future);

        log("Blocking of main thread start (main thread statue = WAITING)");
        Integer result = future.get();
        log("Blocking of main thread end (main thread statue = RUNNABLE)");

        log("Result=" + result);
        log("Future=" + future);
        es.close();
    }

    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("Start");
            sleep(2_000);
            int value = new Random().nextInt(10);
            log("Value=" + value);
            log("End");
            return value;
        }
    }
}
