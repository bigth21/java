package lecture.intermediate.exception.basic.unchecked;


public class Client {
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
