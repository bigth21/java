package lecture.basic.inheritance.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
//        super(); // Can be omitted.
        this(a, 0);
        System.out.println("a = " + a);
        System.out.println("Class B constructor");
    }

    public ClassB(int a, int b) {
        super(); // Can be omitted.
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Class B constructor");
    }
}
