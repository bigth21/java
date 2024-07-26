package lecture.intermediate.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int instanceVariable = 3;

    public Printer process(int var) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("this.value = " + this.value);
                System.out.println("localVar = " + localVar);
                System.out.println("var = " + var);
                System.out.println("instanceVariable = " + instanceVariable);
            }
        }

        return new LocalPrinter();
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(2);
        printer.print();

        for (Field field : printer.getClass().getDeclaredFields()) {
            System.out.println("field = " + field);
        }

    }
}
