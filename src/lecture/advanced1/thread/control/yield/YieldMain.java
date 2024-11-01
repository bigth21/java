package lecture.advanced1.thread.control.yield;

public class YieldMain {
    static final int THREAD_COUNT = 10;

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
//                 sleep(1);
                 Thread.yield();
            }
        }
    }
}
