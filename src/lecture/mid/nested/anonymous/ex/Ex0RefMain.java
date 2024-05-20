package lecture.mid.nested.anonymous.ex;

public class Ex0RefMain {
    public static void hello(String target) {
        System.out.println("Start program");
        System.out.println(target);
        System.out.println("End program");
    }

    public static void main(String[] args) {
        hello("Hello Java");
        hello("Hello Spring");
    }
}
