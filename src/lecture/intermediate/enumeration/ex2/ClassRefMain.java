package lecture.intermediate.enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("ClassGrade.BASIC.getClass() = " + ClassGrade.BASIC.getClass());
        System.out.println("ClassGrade.BASIC.getClass() = " + ClassGrade.GOLD.getClass());
        System.out.println("ClassGrade.BASIC.getClass() = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ClassGrade.BASIC = " + ClassGrade.BASIC);
        System.out.println("ClassGrade.BASIC = " + ClassGrade.GOLD);
        System.out.println("ClassGrade.BASIC = " + ClassGrade.DIAMOND);
    }
}
