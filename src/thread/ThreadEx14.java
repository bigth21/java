package thread;

import javax.swing.*;

/**
 * Thread Execution Control
 * interrupt() & interrupted()
 */
public class ThreadEx14 {

    public static void main(String[] args) {
        ThreadEx14_1 thread1 = new ThreadEx14_1();
        thread1.start();
        String input = JOptionPane.showInputDialog("Enter anything");
        System.out.println("input = " + input);
        thread1.interrupt();
        System.out.println("thread1.isInterrupted() = " + thread1.isInterrupted());
    }

    private static class ThreadEx14_1 extends Thread {
        public void run() {
            int i = 10;
            while (i != 0 && !isInterrupted()) {
                System.out.println(i--);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    interrupt();
                }
            }
            System.out.println("Terminate count down");
        }
    }
}
