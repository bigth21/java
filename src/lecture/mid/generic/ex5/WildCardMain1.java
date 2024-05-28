package lecture.mid.generic.ex5;

import lecture.mid.generic.animal.Animal;
import lecture.mid.generic.animal.Cat;
import lecture.mid.generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("dog", 100));

        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printWildCardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildCardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildcardEx.printAndReturnWildCard(dogBox);

    }
}
