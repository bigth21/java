package lecture.mid.generic.ex2;

import lecture.mid.generic.animal.Animal;

public class Box<T extends Animal> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
