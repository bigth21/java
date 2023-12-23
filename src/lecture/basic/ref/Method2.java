package lecture.basic.ref;

public class Method2 {
    public static void main(String[] args) {

        Student student1 = createStudent("Student1", 15, 90);
        Student student2 = createStudent("Student2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    private static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    private static void printStudent(Student student) {
        System.out.printf("Name:%s Age:%d Grade:%d\n", student.name, student.age, student.grade);
    }
}
