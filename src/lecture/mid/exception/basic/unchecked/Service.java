package lecture.mid.exception.basic.unchecked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("Handle exception, message=" + e.getMessage());
        }
        System.out.println("Continue normal flow");
    }

    public void callThrow() {
        client.call();
    }
}
