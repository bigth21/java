package lecture.intermediate.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.print();
        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
