package lecture.intermediate.generic.ex3;

import lecture.intermediate.generic.animal.Cat;
import lecture.intermediate.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        dogHospital.set(dog);
        Dog bigger = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println("bigger = " + bigger);
    }
}
