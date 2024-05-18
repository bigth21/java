package lecture.mid1.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int instanceVariable = 3;

    public Printer process(int var) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("this.value = " + this.value);
//                System.out.println("localVar = " + localVar);
//                System.out.println("var = " + var);
                System.out.println("instanceVariable = " + instanceVariable);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        localVar = 10;
        var = 20;
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV1 = new LocalOuterV4();
        Printer printer = localOuterV1.process(2);
        printer.print();

        for (Field field : printer.getClass().getDeclaredFields()) {
            System.out.println("field = " + field);
        }

    }
}
