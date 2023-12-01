package method;

public class MethodRef2 {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("result: " + sum1);

        int sum2 = add(15, 20);
        System.out.println("result: " + sum2);

    }

    private static int add(int a, int b) {
        System.out.println(a + "+" + b);
        int sum = a + b;
        return sum;
    }
}
