package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("Before invoke changeNumber -> " + num1);
        changeNumber(num1);
        System.out.println("After invoke changeNumber -> " + num1);
    }

    private static void changeNumber(int num1) {
        System.out.println("Before change number -> " + num1);
        num1 *= 2;
        System.out.println("After change number -> " + num1);
    }
}
