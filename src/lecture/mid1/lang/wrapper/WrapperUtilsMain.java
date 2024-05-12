package lecture.mid1.lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int i3 = Integer.parseInt("10");

        int compareResult = i1.compareTo(i2);
        System.out.println("compareResult = " + compareResult);

        System.out.println("i1 + i2 = " + Integer.sum(10, 20));
        System.out.println("Integer.max(10, 20) = " + Integer.max(10, 20));
        System.out.println("Integer.min(10, 20) = " + Integer.min(10, 20));
    }
}
