package lecture.basic.polymorphism.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        dog.sound();
        cat.sound();
        caw.sound();

        dog.move();
        cat.move();
        caw.move();

        int a = (int) (1e9 + 7);
        System.out.println(a);

    }
}
