package lecture.mid.generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String string = (String) stringBox.get();
        System.out.println("string = " + string);

        integerBox.set("100");
        Integer result = (Integer) integerBox.get(); // ClassCastException
        System.out.println("result = " + result);
    }
}
