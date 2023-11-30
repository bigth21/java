package conditionalstatement;

public class If4 {

    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("Preschool");
        } else if (age <= 13) {
            System.out.println("Elementary");
        } else if (age <= 16) {
            System.out.println("Middle");
        } else if (age <= 19) {
            System.out.println("High");
        } else {
            System.out.println("Adult");
        }
    }
}
