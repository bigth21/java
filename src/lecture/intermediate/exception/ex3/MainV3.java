package lecture.intermediate.exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
        var networkService = new NetworkServiceV3_2();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("String to transmit: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("Program terminated.");
    }
}
