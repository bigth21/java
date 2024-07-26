package lecture.intermediate.exception.ex4;

import lecture.intermediate.exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV5 {
    public static void main(String[] args) {
        var networkService = new NetworkServiceV5();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("String to transmit: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                handleException(e);
            }
            System.out.println();
        }
        System.out.println("Program terminated.");
    }

    private static void handleException(Exception e) {
        System.out.println("Unknown exception");
        e.printStackTrace(System.out);

        // Handle individually if necessary
        if (e instanceof SendExceptionV4 se) {
            System.out.println("Send Error: " + se.getSendData() + ", Message: " + e.getMessage());
        }
    }
}
