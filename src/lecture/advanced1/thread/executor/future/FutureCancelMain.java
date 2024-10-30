package lecture.advanced1.thread.executor.future;

import java.util.concurrent.*;

import static lecture.advanced1.util.MyLogger.log;
import static lecture.advanced1.util.ThreadUtils.sleep;

public class FutureCancelMain {
//    private static boolean mayInterruptIfRunning = true;
    private static boolean mayInterruptIfRunning = false;

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<String> future = es.submit(new MyTask());
        log("Future.state: " + future.state());

        sleep(3_000);

        log("future.cancel(mayInterruptIfRunning=" + mayInterruptIfRunning + ")");
        boolean cancelResult = future.cancel(mayInterruptIfRunning);
        log("future.cancel(mayInterruptIfRunning=" + mayInterruptIfRunning + ") result=" + cancelResult);

        try {
            log("Future result: " + future.get());
        } catch (CancellationException e) {
            log("Future already cancelled");
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }

        es.close();
    }

    static class MyTask implements Callable<String> {

        @Override
        public String call() {
            try {
                for (int i = 0; i < 10; i++) {
                    log("Executing: " + i);
                    Thread.sleep(1_000);
                }
            } catch(InterruptedException e) {
                log("Interrupted");
                return "Interrupted";
            }

            return "Completed";
        }
    }
}
