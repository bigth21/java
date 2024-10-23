package lecture.advanced.thread.bounded;

import java.util.ArrayList;
import java.util.List;

import static lecture.advanced.util.MyLogger.log;
import static lecture.advanced.util.ThreadUtils.sleep;

public class BoundedMain {
    public static void main(String[] args) {
        BoundedQueue queue = new BoundedQueueV4(2);

//        producerFirst(queue);
        consumerFirst(queue);
    }

    private static void producerFirst(BoundedQueue queue) {
        log("Start producerFirst, " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads = new ArrayList<>();
        produce(queue, threads);
        printAllState(queue, threads);
        consume(queue, threads);
        printAllState(queue, threads);
        log("End producerFirst, " + queue.getClass().getSimpleName() + " ==");
    }

    private static void consumerFirst(BoundedQueue queue) {
        log("Start consumerFirst, " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads = new ArrayList<>();
        consume(queue, threads);
        printAllState(queue, threads);
        produce(queue, threads);
        printAllState(queue, threads);
        log("End consumerFirst, " + queue.getClass().getSimpleName() + " ==");
    }

    private static void produce(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("Start produce");
        for (int i = 1; i <= 3; i++) {
            Thread producer = new Thread(new ProducerTask(queue, "data" + i), "producer" + i);
            threads.add(producer);
            producer.start();
            sleep(100);
        }
        log("End produce");
    }

    private static void consume(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("Start consume");
        for (int i = 1; i <= 3; i++) {
            Thread consumer = new Thread(new ConsumerTask(queue), "consumer" + i);
            threads.add(consumer);
            consumer.start();
            sleep(100);
        }
        log("End consume");
    }

    private static void printAllState(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("Start printAllState");
        for (Thread thread : threads) {
            log(thread.getName() + " : " + thread.getState());
        }
        log("End printAllState");
    }
}
