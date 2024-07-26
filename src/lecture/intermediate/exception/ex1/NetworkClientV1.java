package lecture.intermediate.exception.ex1;

public class NetworkClientV1 {
    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError) {
            System.out.println("Connection failed (" + address + ")");
            return "connectError";
        }
        System.out.println("Connect server(" + address + ")");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println("Send failed (" + address + ")");
            return "sendError";
        }
        System.out.println("Send data to server(" + address + ")");
        return "success";
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
