package lecture.intermediate.exception.basic.unchecked;

public class CheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
    }
}
