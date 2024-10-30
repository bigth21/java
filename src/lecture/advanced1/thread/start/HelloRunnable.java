package lecture.advanced1.thread.start;

public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
