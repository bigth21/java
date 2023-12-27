package thread;

/**
 * Thread Execution Control
 * sleep()
 */
public class ThreadEx12 {

    public static void main(String[] args) {
        ThreadEx12_1 thread1 = new ThreadEx12_1();
        ThreadEx12_2 thread2 = new ThreadEx12_2();

        thread1.start();
        thread2.start();

        try {
//            thread1.sleep(2000); // Suspend main thread, not thread1
            Thread.sleep(2000);
        } catch (InterruptedException e) {}

        System.out.print("Terminate main thread");
    }

    private static class ThreadEx12_1 extends Thread {
        public void run() {
            for (int i = 0; i < 300; i++) {
                System.out.print("-");
            }
            System.out.print("Terminate thread1");
        }
    }

    private static class ThreadEx12_2 extends Thread {
        public void run() {
            for (int i = 0; i < 300; i++) {
                System.out.print("-");
            }
            System.out.print("Terminate thread2");
        }
    }
}
