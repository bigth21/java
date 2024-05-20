package lecture.mid.lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] arr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};
        System.out.println(find(arr, -1));
        System.out.println(find(arr, 0));
        System.out.println(find(arr, 1));
        System.out.println(find(arr, 100));
    }

    private static MyInteger find(MyInteger[] arr, int target) {
        for (MyInteger myInteger : arr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
