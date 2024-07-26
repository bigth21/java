package lecture.intermediate.nested.local;

public class LocalOuterV2 {
    private int instanceVariable = 3;

    public void process(int var) {
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

        new LocalPrinter().print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }
}
