package lecture.mid.generic.ex4;

import lecture.mid.generic.animal.Animal;
import lecture.mid.generic.animal.Cat;
import lecture.mid.generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        dog = new Dog("bigDog", 200);
        Animal bigger = AnimalMethod.bigger(dog, cat);
        System.out.println("bigger = " + bigger);
    }
}
