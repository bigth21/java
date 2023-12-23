package lecture.start.array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students;
        students = new int[]{90, 80, 70, 60, 50};

        for (int i = 0; i < students.length; i++) {
            System.out.printf("student%d = %d\n", i + 1, students[i]);
        }
    }
}
