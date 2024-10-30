package lecture.advanced1.thread.start;

public class RunnableThreadMainV2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " start");
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            System.out.println(Thread.currentThread().getName() + " end");
        });
        thread.start();
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
