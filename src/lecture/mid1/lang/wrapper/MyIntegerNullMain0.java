package lecture.mid1.lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(find(intArr, -1));
        System.out.println(find(intArr, 0));
        System.out.println(find(intArr, 1));
        System.out.println(find(intArr, 100));
    }

    private static int find(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
