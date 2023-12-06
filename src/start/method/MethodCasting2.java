package start.method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 1;
        printNumber((int) number);
    }

    private static void printNumber(double number) {
        System.out.println("number: " + number);
    }
}
