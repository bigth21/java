package lecture.start.operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        // Unary prefix lecture.start.operator
        int a = 1;
        int b = 0;
        b = ++a;
        System.out.println("a = " + a + ", b = " + b);

        // Unary suffix lecture.start.operator(postfix lecture.start.operator)
        a = 1;
        b = 0;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);
    }
}
