package lecture.mid.exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String message) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);
        client.connect();
        client.send(message);
        client.disconnect();
    }
}