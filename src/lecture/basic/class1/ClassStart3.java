package lecture.basic.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Student1", 15, 90),
                new Student("Student2", 16, 80)};

        for (Student student : students) {
            System.out.printf("Name:%s Age:%d Grade:%d\n", student.name, student.age, student.grade);
        }
    }
}
