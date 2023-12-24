package lecture.basic.polymorphism.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent = new Child();
        Child child1 = (Child) parent;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // ClassCastException
        child2.childMethod();
    }
}
