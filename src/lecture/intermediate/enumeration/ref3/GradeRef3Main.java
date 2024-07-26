package lecture.intermediate.enumeration.ref3;

public class GradeRef3Main {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] values = Grade.values();
        for (Grade grade : values) {
            System.out.println(grade.name() + ": " + grade.discount(price));
        }
    }
}
