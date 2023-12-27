package lecture.basic.polymorphism.ex4;

public class Caw extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Moo");
    }

    @Override
    public void move() {
        System.out.println("Caw move");
    }
}
