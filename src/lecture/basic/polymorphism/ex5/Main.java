package lecture.basic.polymorphism.ex5;

public class Main {

    public static void main(String[] args) {
//        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
}
