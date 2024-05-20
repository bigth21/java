package lecture.mid.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain {
    public static void hello(Runnable r) {
        System.out.println("Start");
        r.run();
        System.out.println("End");
    }

    public static void main(String[] args) {
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        });

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
