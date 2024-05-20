package lecture.mid.exception.ex4;

public class NetworkServiceV4 {
    public void sendMessage(String message) {
        String address = "http://example.com";
        var client = new NetworkClientV4(address);
        client.initError(message);
        try {
            client.connect();
            client.send(message);
        } finally {
            client.disconnect();
        }
    }
}
