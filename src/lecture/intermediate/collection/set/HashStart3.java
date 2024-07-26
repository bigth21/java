package lecture.intermediate.collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[100];
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[5] = 5;
        numbers[8] = 8;
        numbers[14] = 14;
        numbers[99] = 99;
        System.out.println("numbers = " + Arrays.toString(numbers));

        int targetNumber = 99;
        System.out.println("numbers[targetNumber] = " + numbers[targetNumber]);
    }
}
