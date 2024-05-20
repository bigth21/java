package lecture.mid.exception.ex0;

public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        System.out.println("Connect server(" + address + ")");
        return "success";
    }

    public String send(String data) {
        System.out.println("Send data to server(" + address + ")");
        return "success";
    }

    public void disconnect() {
        System.out.println("Disconnect server(" + address + ")");
    }
}
