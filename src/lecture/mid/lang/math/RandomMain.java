package lecture.mid.lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        randomInt = random.nextInt(10); // 0 ~ 9
        System.out.println("randomInt = " + randomInt);

        randomInt = random.nextInt(10) + 1;
        System.out.println("randomInt = " + randomInt);
    }
}
