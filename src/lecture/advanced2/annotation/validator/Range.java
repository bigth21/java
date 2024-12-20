package lecture.advanced2.annotation.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {
    String message() default "Field value is out of range";
    int min() default 0;
    int max() default Integer.MAX_VALUE;
}
