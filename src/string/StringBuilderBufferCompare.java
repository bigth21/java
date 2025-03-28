package string;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StringBuilderBufferCompare {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) { // To ensure the same conditions for optimization
            testStringBuilder();
            testStringBuffer();
        }
    }

    private static void testStringBuilder() throws InterruptedException {
        long startTime = System.nanoTime();
        var sb = new StringBuilder();

        var countDownLatch = new CountDownLatch(100);
        try (ExecutorService executor = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < 100; i++) {
                executor.execute(() -> {
                    for (int j = 0; j < 100; j++) {
                        sb.append("A");
                    }
                    countDownLatch.countDown();
                });
            }
        }

        countDownLatch.await();
        long endTime = System.nanoTime();

        System.out.println("time = " + (endTime - startTime) / 1000);
        System.out.println("sb.length() = " + sb.length());
    }

    private static void testStringBuffer() throws InterruptedException {
        long startTime = System.nanoTime();
        var sb = new StringBuffer();
        var countDownLatch = new CountDownLatch(100);

        try (ExecutorService executor = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < 100; i++) {
                executor.execute(() -> {
                    for (int j = 0; j < 100; j++) {
                        sb.append("A");
                    }
                    countDownLatch.countDown();
                });
            }
        }

        countDownLatch.await();
        long endTime = System.nanoTime();

        System.out.println("time = " + (endTime - startTime) / 1000);
        System.out.println("sb.length() = " + sb.length());
    }
}
