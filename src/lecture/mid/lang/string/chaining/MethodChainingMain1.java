package lecture.mid.lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        int value = new ValueAdder()
                .add(1)
                .add(2)
                .add(3)
                .getValue();
        System.out.println("value = " + value);
    }
}
