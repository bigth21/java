package lecture.mid1.lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str ="Hello, Java!";

        System.out.println("String.valueOf(num) = " + String.valueOf(num));
        System.out.println("String.valueOf(bool) = " + String.valueOf(bool));
        System.out.println("String.valueOf(str) = " + String.valueOf(obj));

        String numStr2 = "" + num;
        System.out.println("numStr2 = " + numStr2);

        char[] charArray = str.toCharArray();
        System.out.println("charArray = " + charArray);
        System.out.println(charArray);
        for (char c : charArray) {
            System.out.print(c);
        }

    }
}
