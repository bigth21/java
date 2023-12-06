package start.method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("Program executes");
        printFooter();
    }

    private static void printHeader() {
        System.out.println("Program starts");
    }

    private static void printFooter() {
        System.out.println("Program ends");
    }
}
