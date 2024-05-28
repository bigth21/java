package lecture.mid.generic.ex5;

import lecture.mid.generic.animal.Animal;
import lecture.mid.generic.animal.Cat;
import lecture.mid.generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox);
//        writeBox(catBox);

    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("dog", 100));
    }
}
