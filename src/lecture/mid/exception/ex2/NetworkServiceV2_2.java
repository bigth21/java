package lecture.mid.exception.ex2;

public class NetworkServiceV2_2 {
    public void sendMessage(String message) {
        String address = "http://example.com";
        var client = new NetworkClientV2(address);
        client.initError(message);
        try {
            client.connect();
            client.send(message);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println(e.getErrorCode());
        } finally {
            client.disconnect();
        }
    }
}
