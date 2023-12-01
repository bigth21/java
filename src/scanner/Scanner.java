package scanner;

public class Scanner {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter a second number");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Bigger: " + num1);
        } else if (num1 < num2) {
            System.out.println("Bigger: " + num2);
        } else {
            System.out.println("Same");
        }
    }
}
