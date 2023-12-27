package lecture.basic.polymorphism.ex6;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();

        soundAnimal(dog);
        soundAnimal(bird);

        flyAnimal(bird);
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }

    private static void flyAnimal(Fly animal) {
        animal.fly();
    }
}
