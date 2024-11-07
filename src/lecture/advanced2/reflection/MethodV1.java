package lecture.advanced2.reflection;

import lecture.advanced2.reflection.data.BasicData;

import java.lang.reflect.Method;

public class MethodV1 {
    public static void main(String[] args) {
        Class<BasicData> clazz = BasicData.class;

        System.out.println("========methods()========");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        System.out.println("========declaredMethods()========");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod);
        }
    }
}
