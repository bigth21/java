package lecture.mid.collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 5;
        numbers[3] = 8;
        System.out.println("numbers = " + Arrays.toString(numbers));

        int targetNumber = 8;
        for (Integer number : numbers) {
            if (number == targetNumber) {
                System.out.println("number = " + number);
            }
        }
    }
}
