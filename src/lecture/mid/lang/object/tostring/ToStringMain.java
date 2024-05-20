package lecture.mid.lang.object.tostring;

public class ToStringMain {
    public static void main(String[] args) {
        Object o = new Object();
        String string = o.toString();

        // class name including package and reference(hex hash code)
        System.out.println("string = " + string);
        System.out.println("o = " + o);
    }
}
