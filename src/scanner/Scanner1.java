package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scanner.nextLine();
        System.out.println("str = " + str);

        System.out.println("Enter an integer");
        int intValue = scanner.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.println("Enter a real number");
        double doubleValue = scanner.nextDouble();
        System.out.println("doubleValue = " + doubleValue);
    }
}
