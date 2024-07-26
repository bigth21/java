package lecture.intermediate.enumeration.ex3;

import static lecture.intermediate.enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPercent = 0;
        if (grade == BASIC) {
            discountPercent = 10;
        } else if (grade == GOLD) {
            discountPercent = 20;
        } else if (grade == DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("No discount");
        }

        return price * (100 - discountPercent) / 100;
    }
}
