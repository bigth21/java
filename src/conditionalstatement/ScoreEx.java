package conditionalstatement;

public class ScoreEx {

    public static void main(String[] args) {
        int score = 77;
        System.out.println("score = " + score);
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}