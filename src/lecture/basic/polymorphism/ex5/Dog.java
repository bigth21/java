package lecture.basic.polymorphism.ex5;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Bowwow");
    }

    @Override
    public void move() {
        System.out.println("Dog move");
    }
}
