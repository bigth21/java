package lecture.advanced2.annotation.validator;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(NotEmpty.class)) {
                NotEmpty notEmpty = field.getAnnotation(NotEmpty.class);
                String value = (String) field.get(obj);
                if (value == null || value.isEmpty()) {
                    throw new RuntimeException(notEmpty.message());
                }
            }

            if (field.isAnnotationPresent(Range.class)) {
                Range range = field.getAnnotation(Range.class);
                long value = field.getLong(obj);
                if (value < range.min() || value > range.max()) {
                    throw new RuntimeException(range.message());
                }
            }
        }
    }
}
