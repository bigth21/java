package basic.construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        System.out.printf("Invoke constructor name:%s age:%d grade:%d\n", name, age, grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
