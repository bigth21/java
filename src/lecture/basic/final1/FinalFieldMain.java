package lecture.basic.final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println("constructInit1 = " + constructInit1.value);
        System.out.println("constructInit2 = " + constructInit2.value);

        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1.value = " + fieldInit1.value);
        System.out.println("fieldInit2.value = " + fieldInit2.value);
        System.out.println("fieldInit3.value = " + fieldInit3.value);

        System.out.println("FieldInit.CONST_VALUE = " + FieldInit.CONST_VALUE);
    }
}
