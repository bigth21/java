package lecture.advanced.thread.executor.future;

import java.util.concurrent.*;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class FutureExceptionMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<Integer> future = es.submit(new ExCallable());
        sleep(1_000);

        try {
            log("future.get(), future.state(): " + future.state());
            Integer result = future.get();
            log("result: " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    static class ExCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            log("Exception occurs");
            throw new IllegalStateException("ex!");
        }
    }
}
