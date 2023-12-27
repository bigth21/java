package thread;

import javax.swing.*;

public class ThreadEx6 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter any string");
        System.out.println("input = " + input);

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
