package lecture.mid.exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        var networkService = new NetworkServiceV1_3();
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
