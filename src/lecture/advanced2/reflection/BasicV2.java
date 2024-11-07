package lecture.advanced2.reflection;

import lecture.advanced2.reflection.data.BasicData;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class BasicV2 {
    public static void main(String[] args) {
        Class<BasicData> basicDataClazz = BasicData.class;
        System.out.println("basicDataClazz.getName() = " + basicDataClazz.getName());
        System.out.println("basicDataClazz.getSimpleName() = " + basicDataClazz.getSimpleName());
        System.out.println("basicDataClazz.getPackage() = " + basicDataClazz.getPackage());

        System.out.println("basicDataClazz.getSuperclass() = " + basicDataClazz.getSuperclass());
        System.out.println("basicDataClazz.getInterfaces() = " + Arrays.toString(basicDataClazz.getInterfaces()));

        System.out.println("basicDataClazz.isInterface() = " + basicDataClazz.isInterface());
        System.out.println("basicDataClazz.isEnum() = " + basicDataClazz.isEnum());
        System.out.println("basicDataClazz.isAnnotation() = " + basicDataClazz.isAnnotation());

        int modifiers = basicDataClazz.getModifiers();
        System.out.println("basicDataClazz.getModifiers() = " + modifiers);
        System.out.println("Modifier.isPublic(modifiers) = " + Modifier.isPublic(modifiers));
        System.out.println("Modifier.toString(modifiers) = " + Modifier.toString(modifiers));
    }
}
