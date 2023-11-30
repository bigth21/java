package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        // Unary prefix operator
        int a = 1;
        int b = 0;
        b = ++a;
        System.out.println("a = " + a + ", b = " + b);

        // Unary suffix operator(postfix operator)
        a = 1;
        b = 0;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);
    }
}
