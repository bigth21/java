package lecture.intermediate.exception.ex4;

import lecture.intermediate.exception.ex4.exception.ConnectionExceptionV4;
import lecture.intermediate.exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {
    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() throws ConnectionExceptionV4 {
        if (connectError) {
            throw new ConnectionExceptionV4(address, "Connection failed (" + address + ")");
        }
        System.out.println("Connect server(" + address + ")");
    }

    public void send(String data) throws SendExceptionV4 {
        if (sendError) {
            throw new SendExceptionV4(data, "Send failed (" + address + ")");
        }
        System.out.println("Send data(" + data + ") to server(" + address + ")");
    }

    public void disconnect() {
        System.out.println("Disconnect server(" + address + ")");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
