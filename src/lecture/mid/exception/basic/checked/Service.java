package lecture.mid.exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("Handle exception, message=" + e.getMessage());
        }
        System.out.println("Continue normal flow");
    }

    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
