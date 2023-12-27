package lecture.basic.polymorphism.ex5;

public class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Cat move");
    }
}
