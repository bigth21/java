package lecture.mid.generic.ex5;

import lecture.mid.generic.animal.Animal;

public class WildcardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("box.get() = " + box.get());
    }

    static void printWildCardV1(Box<?> box) {
        System.out.println("box.get() = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("t.getName() = " + t.getName());
        System.out.println("t.getSize() = " + t.getSize());
    }

    static  void printWildCardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("animal.getName() = " + animal.getName());
        System.out.println("animal.getSize() = " + animal.getSize());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("t.getName() = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildCard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("animal.getName() = " + animal.getName());
        return animal;
    }
}
