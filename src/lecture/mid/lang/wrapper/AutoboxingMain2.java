package lecture.mid.lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = 7; // Auto boxing

        // Wrapper -> Primitive
        int unBoxedValue = boxedValue; // Auto unboxing

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unBoxedValue = " + unBoxedValue);
    }
}
