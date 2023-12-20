package basic.memory;

public class JavaMemoryMain1 {

    public static void main(String[] args) {
        System.out.println("Main start");
        method1(10);
        System.out.println("Main end");
    }

    private static void method1(int m1) {
        System.out.println("Method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("Method1 end");
    }

    private static void method2(int m2) {
        System.out.println("Method2 start");
        System.out.println("Method2 end");
    }


}
