package lecture.intermediate.enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade grade, int price) {
        return price * (100 - grade.getDiscountPercent()) / 100;
    }
}
