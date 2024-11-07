package lecture.advanced2.reflection;

import lecture.advanced2.reflection.data.BasicData;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class FieldV1 {
    public static void main(String[] args) {
        Class<BasicData> clazz = BasicData.class;

        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
    }
}
