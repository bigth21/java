package lecture.mid.exception.ex4;

public class NetworkServiceV5 {
    public void sendMessage(String message) {
        String address = "http://example.com";
        try (var client = new NetworkClientV5(address)) {
            client.initError(message);
            client.connect();
            client.send(message);
        }
    }
}
