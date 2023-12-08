package basic.ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("dataA.value = " + dataA.value);
    }

    private static void changeReference(Data dataA) {
        dataA.value = 20;
    }
}
