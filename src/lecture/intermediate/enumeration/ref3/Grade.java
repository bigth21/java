package lecture.intermediate.enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountRate;

    Grade(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int discount(int price) {
        return price * (100 - discountRate) / 100;
    }
}
