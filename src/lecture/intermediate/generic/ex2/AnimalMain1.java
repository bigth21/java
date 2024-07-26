package lecture.intermediate.generic.ex2;

import lecture.intermediate.generic.animal.Animal;
import lecture.intermediate.generic.animal.Cat;
import lecture.intermediate.generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 0);
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog dogFound = dogBox.get();
        System.out.println("dogFound = " + dogFound);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat catFound = catBox.get();
        System.out.println("catFound = " + catFound);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal animalFound = animalBox.get();
        System.out.println("animalFound = " + animalFound);
    }
}
