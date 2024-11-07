package lecture.advanced2.reflection;

import java.lang.reflect.Field;

public class FieldUtils {
    public static void nullFieldToDefault(Object target) throws IllegalAccessException {
        Class<?> clazz = target.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.get(target) == null) {
                if (field.getType() == String.class) {
                    field.set(target, "");
                }
            }
            field.setAccessible(false);
        }
    }
}
