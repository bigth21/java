package lecture.basic.final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10;
//        data1 = 20; // Unable to reallocation

        final int data2 = 10;
//        data2 = 20; // Unable to reallocation
    }

    static void method(final int parameter) {
//        parameter = 20; // Unchangeable
    }
}
