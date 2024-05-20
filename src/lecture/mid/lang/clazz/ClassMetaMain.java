package lecture.mid.lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<String> clazz = String.class;
//        Class<? extends String> clazz1 = new String().getClass();
//        Class<?> clazz2 = Class.forName("java.lang.String");

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
            System.out.println("field.getType() = " + field.getType());
            System.out.println("field.getName() = " + field.getName());
        }

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        Class<? super String> superclass = clazz.getSuperclass();
        System.out.println("superclass = " + superclass);

        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("interface = " + anInterface);
        }

    }
}
