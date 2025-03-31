package string;

public class StringImmutability {
    public static void main(String[] args) {
        // Create a String object
        String original = "Hello";
        System.out.println("original = " + original);
        System.out.println("System.identityHashCode(original) = " + System.identityHashCode(original));

        // Modify the string by concatenating " World"
        String modified = original + " World";
        System.out.println("modified = " + modified);
        System.out.println("System.identityHashCode(modified) = " + System.identityHashCode(modified));
        System.out.println("original == modified = " + (original == modified));

        // Check if the original string changed
        System.out.println("original = " + original);
        System.out.println("System.identityHashCode(original) = " + System.identityHashCode(original));
    }
}
