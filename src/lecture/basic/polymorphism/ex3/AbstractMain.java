package lecture.basic.polymorphism.ex3;

public class AbstractMain {

    public static void main(String[] args) {
//        AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }
}
