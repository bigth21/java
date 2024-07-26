package lecture.intermediate.lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        System.out.println("child = " + child); // Info about object
        String toString = child.toString();
        System.out.println("child.toString() = " + toString); // Info about object
    }
}
