package lecture.basic.polymorphism.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Child parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) {
            child.childMethod();
        }
    }
}
