package lecture.basic.polymorphism.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw()};
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
