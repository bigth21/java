package scanner;

import java.util.Scanner;

public class ScannerWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter a string(exit -> shut down)");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("Shut down program");
                break;
            }
            System.out.println("Entered string: " + str);
        }
    }
}
