package start.operator;

public class Logical1 {

    public static void main(String[] args) {
        System.out.println("&&: AND start.operator");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR start.operator");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("!: Negation start.operator");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("With variables");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
