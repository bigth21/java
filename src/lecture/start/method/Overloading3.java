package lecture.start.method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 2.5));
    }

    public static int add(int a, int b) {
        System.out.println("Invoke 1");
        return a + b;
    }

    public static double add(double a, double b) {
        System.out.println("Invoke 1");
        return a + b;
    }
}
