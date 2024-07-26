package lecture.intermediate.nested.nested;

public class NestedOuter {
    private static int classVariable = 3;
    private int instanceVariable = 2;

    static class Nested {
        private int instanceVariable = 3;

        public void print() {
            System.out.println("instanceValue = " + instanceVariable);
            System.out.println("classValue = " + classVariable);
        }
    }
}
