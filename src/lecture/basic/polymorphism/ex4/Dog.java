package lecture.basic.polymorphism.ex4;

public class Dog extends AbstractAnimal {

    @Override
    public void sound() {
        System.out.println("Bowwow");
    }

    @Override
    public void move() {
        System.out.println("Dog move");
    }
}
