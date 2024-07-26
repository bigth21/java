package lecture.intermediate.exception.ex3;

import lecture.intermediate.exception.ex3.exception.ConnectionExceptionV3;
import lecture.intermediate.exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {
    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectionExceptionV3 {
        if (connectError) {
            throw new ConnectionExceptionV3(address, "Connection failed (" + address + ")");
        }
        System.out.println("Connect server(" + address + ")");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(data, "Send failed (" + address + ")");
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
