package lecture.mid1.nested.local;

public class LocalOuterV1 {
    private int instanceVariable = 3;

    public void process(int var) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

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
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
