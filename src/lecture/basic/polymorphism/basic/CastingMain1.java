package lecture.basic.polymorphism.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        Parent poly = new Child();
        poly.parentMethod();

        // Down casting.
        Child child = (Child) poly;
        child.childMethod();
    }
}
