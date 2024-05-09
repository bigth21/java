package lecture.mid1.lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println("format1 = " + format1);

        String format2 = String.format("num: %.2f", 10.1264); // Round up number
        System.out.println("format2 = " + format2);
        System.out.printf("num: %.2f\n", 10.1264);

        String regex = "Hello, (Java!|World)";
        System.out.println("str.matches(regex) = " + str.matches(regex));
    }
}
