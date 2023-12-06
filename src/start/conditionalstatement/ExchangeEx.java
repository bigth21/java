package start.conditionalstatement;

public class ExchangeEx {

    public static void main(String[] args) {
        int dollar = 10;
        System.out.println("dollar = " + dollar);

        if (dollar < 0) {
            System.out.println("False");
        } else if (dollar == 0) {
            System.out.println("No money");
        } else {
            System.out.printf("환전금액은 %d원입니다.", dollar);
        }
    }
}
