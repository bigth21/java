package lecture.mid.lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("str.substring(7) = " + str.substring(7));
        System.out.println("str.substring(7) = " + str.substring(7, 12));
        System.out.println("str.concat(\"!!!\") = " + str.concat("!!!"));

        System.out.println("str.replace(\"Java\", \"World\") = " + str.replace("Java", "World")); // Replace all
        System.out.println("str.replace('o', '') = " + str.replace('o', 'a')); // Replace all

        System.out.println("str.replaceFirst(\"Java\", \"World\") = " + str.replaceFirst("Java", "World")); //Replace first. Parameter type is regex.
        System.out.println("str.replaceAll(\"Java\", \"World\") = " + str.replaceAll("Java", "World")); //Replace all. Parameter type is regex.

    }
}
