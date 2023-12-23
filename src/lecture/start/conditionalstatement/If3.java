package lecture.start.conditionalstatement;

public class If3 {

    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("Preschool");
        }
        if (age >= 8 && age <= 13) {
            System.out.println("Elematary");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("Middle");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("High");
        }
        if (age >= 20) {
            System.out.println("Adult");
        }
    }
}
