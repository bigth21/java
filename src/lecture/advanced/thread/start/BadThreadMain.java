package lecture.advanced.thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        HelloThread helloThread = new HelloThread();
        helloThread.run(); // Do not invoke run method -> Main thread executes run method.
//        helloThread.start();
    }
}