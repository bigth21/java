package lecture.mid.nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void helloDice() {
        System.out.println("Start");

        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("randomValue = " + randomValue);

        System.out.println("End");
    }

    public static void helloSum() {
        System.out.println("Start");

        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("End");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
