package lecture.mid.lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("Dog1", 2);
        Dog dog2 = new Dog("Dog2", 5);

        System.out.println("car = " + car);
        System.out.println("dog1 = " + dog1);
        System.out.println("ref = " + Integer.toHexString(System.identityHashCode(dog1))); // Reference
        System.out.println("dog2 = " + dog2);
        System.out.println("dog2 = " + Integer.toHexString(System.identityHashCode(dog2))); // Reference

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
