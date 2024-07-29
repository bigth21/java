package lecture.advanced.thread.start;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}
