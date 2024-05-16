package lecture.mid1.enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade, int price) {

        return price * (100 - grade.getDiscountRate()) / 100;
    }
}
