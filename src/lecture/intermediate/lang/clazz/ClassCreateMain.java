package lecture.intermediate.lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Hello> helloClass = Hello.class;
//        Class<?> helloClass = Class.forName("lecture.mid1.lang.clazz.Hello");

        Hello hello = helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
