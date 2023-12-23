package lecture.basic.class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = new String[]{"Student1", "Student2"};
        int[] studentAges = new int[]{15, 16};
        int[] studentGrades = new int[]{90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("Name:%s Age:%d Grade:%d\n", studentNames[i], studentAges[i], studentGrades[i]);
        }
    }
}
