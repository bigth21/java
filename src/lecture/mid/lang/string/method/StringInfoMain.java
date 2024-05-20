package lecture.mid.lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java";

        System.out.println("str.length() = " + str.length());

        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("str.isEmpty() = " + "".isEmpty());

        System.out.println("str.isBlank() = " + str.isBlank());
        System.out.println("str.isBlank() = " + "    ".isBlank());

        char c = str.charAt(7);
        System.out.println("c = " + c);
    }
}
