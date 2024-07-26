package lecture.intermediate.generic.ex4;

import lecture.intermediate.generic.animal.Animal;
import lecture.intermediate.generic.animal.Cat;
import lecture.intermediate.generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 50);

        ComplexBox<Animal> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat catReturned = hospital.printAndReturn(cat);
        System.out.println("catReturned = " + catReturned);
    }
}
