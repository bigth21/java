package lecture.start.operator;

/*
    Operator Precedence
 */
public class Operator3 {

    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3; // Same as 1 + (2 * 3)
        int sum2 = (1 + 2) * 3; // Combination low
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
