package basic.memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("Main start");
        method1();
        System.out.println("Main end");
    }

    private static void method1() {
        System.out.println("Method1 start");
        Data data1 = new Data(10);
        System.out.println("data1 = " + data1);
        method2(data1);
        System.out.println("Method1 end");

    }

    private static void method2(Data data2) {
        System.out.println("Method2 start");
        System.out.println("data2 = " + data2);
        System.out.println("data2.getValue() = " + data2.getValue());
        System.out.println("Method2 end");
    }
}
