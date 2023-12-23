package lecture.start.operator;

/*
    Strings Addition
 */
public class Operator2 {

    public static void main(String[] args) {
        // String & String Addition 1
        String result1 = "hello " + "world";
        System.out.println(result1);

        // String & String Addition 2
        String s1 = "String1";
        String s2 = "String2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // String & Number Addition 1
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // String & number Addition 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
