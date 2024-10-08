package lecture.intermediate.exception.ex2;

public class NetworkClientV2_3 implements AutoCloseable {
    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV2_3(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", "Connection failed (" + address + ")");
        }
        System.out.println("Connect server(" + address + ")");
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2("connectError", "Send failed (" + address + ")");
        }
        System.out.println("Send data to server(" + address + ")");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

    @Override
    public void close() {
        System.out.println("Disconnect server(" + address + ")");
    }
}
