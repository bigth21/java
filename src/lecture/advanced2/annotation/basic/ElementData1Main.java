package lecture.advanced2.annotation.basic;

import java.util.Arrays;

public class ElementData1Main {
    public static void main(String[] args) {
        Class<ElementData1> clazz = ElementData1.class;
        AnnoElement annotation = clazz.getAnnotation(AnnoElement.class);

        System.out.println("annotation.value() = " + annotation.value());
        System.out.println("annotation.count() = " + annotation.count());
        System.out.println("annotation.tags() = " + Arrays.toString(annotation.tags()));
        System.out.println("annotation.annoData() = " + annotation.annoData());
    }
}
