package lecture.intermediate.nested.anonymous;

import lecture.intermediate.nested.local.Printer;

public class AnonymousOuter {
    private int instanceVariable = 3;

    public void process(int var) {
        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("this.value = " + this.value);
                System.out.println("localVar = " + localVar);
                System.out.println("var = " + var);
                System.out.println("instanceVariable = " + instanceVariable);
            }
        };

        printer.print();
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
