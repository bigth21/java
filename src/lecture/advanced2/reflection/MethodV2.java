package lecture.advanced2.reflection;

import lecture.advanced2.reflection.data.BasicData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodV2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BasicData instance = new BasicData();
        instance.call();

        Class<? extends BasicData> clazz = instance.getClass();
        Method method1 = clazz.getDeclaredMethod("hello", String.class);
        Object returnValue = method1.invoke(instance, "hi");
        System.out.println("returnValue = " + returnValue);
    }
}
