package lecture.mid.generic.ex4;

import lecture.mid.generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z) {
        System.out.println("z.getClass().getName() = " + animal.getClass().getName());
        System.out.println("z.getClass().getName() = " + z.getClass().getName());
        return z;
    }
}
