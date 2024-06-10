package lecture.mid.collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[5] = 5;
        numbers[8] = 8;
        System.out.println("numbers = " + Arrays.toString(numbers));

        int targetNumber = 8;
        System.out.println("numbers[targetNumber] = " + numbers[targetNumber]);
    }
}
