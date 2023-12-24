package lecture.basic.polymorphism.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child.value = " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("parent.value = " + parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("poly.value = " + poly.value); // Variable hiding
        poly.method(); // Method overriding
    }
}
