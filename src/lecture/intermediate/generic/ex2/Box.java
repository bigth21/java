package lecture.intermediate.generic.ex2;

import lecture.intermediate.generic.animal.Animal;

public class Box<T extends Animal> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
