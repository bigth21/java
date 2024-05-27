package lecture.mid.generic.ex3;

import lecture.mid.generic.animal.Animal;
import lecture.mid.generic.animal.Cat;
import lecture.mid.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        dogHospital.set(dog);
        Animal bigger = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("bigger = " + bigger);
    }
}
