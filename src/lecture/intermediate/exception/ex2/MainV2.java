package lecture.intermediate.exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        var networkService = new NetworkServiceV2_3();
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
