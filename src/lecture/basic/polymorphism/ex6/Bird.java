package lecture.basic.polymorphism.ex6;

public class Bird extends Animal implements Fly {

    @Override
    public void sound() {
        System.out.println("Coo");
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
