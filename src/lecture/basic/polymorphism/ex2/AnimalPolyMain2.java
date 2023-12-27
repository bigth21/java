package lecture.basic.polymorphism.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animals = new Animal[]{dog, cat, caw};
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
