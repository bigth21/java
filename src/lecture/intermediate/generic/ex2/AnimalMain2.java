package lecture.intermediate.generic.ex2;

import lecture.intermediate.generic.animal.Animal;
import lecture.intermediate.generic.animal.Cat;
import lecture.intermediate.generic.animal.Dog;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 0);
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);
        Animal animalFound = animalBox.get();
        System.out.println("animalFound = " + animalFound); // Call overriding method of Cat class
    }
}
