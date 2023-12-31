package lecture.basic.ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "Student1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "Student2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    private static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    private static void printStudent(Student student) {
        System.out.printf("Name:%s Age:%d Grade:%d\n", student.name, student.age, student.grade);
    }
}
