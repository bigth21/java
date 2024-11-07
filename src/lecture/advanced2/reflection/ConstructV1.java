package lecture.advanced2.reflection;

import java.lang.reflect.Constructor;

public class ConstructV1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("lecture.advanced2.reflection.data.BasicData");

        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }

        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("declaredConstructor = " + declaredConstructor);
        }
    }
}
