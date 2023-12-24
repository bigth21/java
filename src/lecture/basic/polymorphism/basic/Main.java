package lecture.basic.polymorphism.basic;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parentMethod();

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        Parent poly = new Child();
        poly.parentMethod();
    }
}
