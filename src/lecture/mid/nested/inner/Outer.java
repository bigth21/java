package lecture.mid.nested.inner;

public class Outer {
    private static int classVariable = 3;
    private int instanceVariable = 2;

    class Inner {
        private int innerInstanceVariable = 1;

        public void print() {
            System.out.println("instanceVariable = " + innerInstanceVariable);
            System.out.println("instanceVariable = " + instanceVariable);
            System.out.println("classVariable = " + classVariable);
        }
    }
}
