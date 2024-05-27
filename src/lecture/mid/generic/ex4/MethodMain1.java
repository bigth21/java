package lecture.mid.generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        Integer i1 = GenericMethod.<Integer>genericMethod(i);
        Integer i2 = GenericMethod.<Integer>numberMethod(i);
        Double d1 = GenericMethod.<Double>numberMethod(20.0);

        // Type Inference
        Integer i3 = GenericMethod.genericMethod(i);
        Integer i4 = GenericMethod.numberMethod(i);
        Double d2 = GenericMethod.numberMethod(20.0);
    }
}
