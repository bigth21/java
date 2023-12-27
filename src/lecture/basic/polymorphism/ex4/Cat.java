package lecture.basic.polymorphism.ex4;


public class Cat extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Cat move");
    }
}
