package lecture.mid.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInt = new Integer(10);
        Integer intObj = Integer.valueOf(10);
        System.out.println("intObj = " + intObj);
        Long longObj = Long.valueOf(100);
        System.out.println("longObj = " + longObj);
        Double doubleObj = Double.valueOf(10.5);
        System.out.println("doubleObj = " + doubleObj);

        int intValue = intObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("newInt == intObj = " + (newInt == intObj));
        System.out.println("newInt.equals(intObj) = " + newInt.equals(intObj));


    }
}
