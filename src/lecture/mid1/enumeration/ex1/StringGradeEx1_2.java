package lecture.mid1.enumeration.ex1;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        // Not exist grade
        int vip = discountService.discount("VIP", price);
        System.out.println("vip = " + vip);

        // Typo
        int diamnd = discountService.discount("DIAMND", price);
        System.out.println("diamnd = " + diamnd);

        // Lower case
        int gold = discountService.discount("gold", price);
        System.out.println("gold = " + gold);
    }
}
