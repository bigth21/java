package conditionalstatement;

public class Switch4 {

    public static void main(String[] args) {
        int grade = 2;
        int coupon = getCoupon(grade);
        System.out.println("발급받은 쿠폰 " + coupon);
    }

    private static int getCoupon(int grade) {
        return switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
    }
}
