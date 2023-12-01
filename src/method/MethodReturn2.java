package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    private static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + " Minor");
        } else {
            System.out.println(age + " Adult");
        }
    }
}
