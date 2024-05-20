package lecture.mid.enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("Grade.BASIC.getClass() = " + Grade.BASIC.getClass());
        System.out.println("Grade.BASIC.getClass() = " + Grade.GOLD.getClass());
        System.out.println("Grade.BASIC.getClass() = " + Grade.DIAMOND.getClass());

        System.out.println("Grade.BASIC = " + ref(Grade.BASIC));
        System.out.println("Grade.BASIC = " + ref(Grade.GOLD));
        System.out.println("Grade.BASIC = " + ref(Grade.DIAMOND));
    }

    private static String ref(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
