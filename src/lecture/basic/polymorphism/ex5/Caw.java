package lecture.basic.polymorphism.ex5;

public class Caw implements Animal {
    @Override
    public void sound() {
        System.out.println("Moo");
    }

    @Override
    public void move() {
        System.out.println("Caw move");
    }
}
