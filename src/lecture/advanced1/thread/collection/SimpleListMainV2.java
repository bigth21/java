package lecture.advanced1.thread.collection;

import static lecture.advanced1.util.MyLogger.log;

public class SimpleListMainV2 {
    public static void main(String[] args) throws InterruptedException {
        SimpleList list = new BasicList();

        log(list.getClass().getSimpleName());

        Runnable taskA = () -> {
            list.add("A");
            log("list.add(A)");
        };

        Runnable taskB = () -> {
            list.add("B");
            log("list.add(B)");
        };

        Thread thread1 = new Thread(taskA);
        Thread thread2 = new Thread(taskB);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        log(list);
    }
}
