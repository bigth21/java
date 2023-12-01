package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("If first number and second number are 0, Program will be shutdown.");
        while (true) {
            System.out.println("Enter first number:");
            int num1 = scanner.nextInt();

            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("Program is shutdown.");
                break;
            }

            int sum = num1 + num2;
            System.out.println("Sum of numbers: " + sum);
        }

    }
}
