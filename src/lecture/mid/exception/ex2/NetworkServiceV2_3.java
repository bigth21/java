package lecture.mid.exception.ex2;

public class NetworkServiceV2_3 {
    public void sendMessage(String message) {
        String address = "http://example.com";
        try (var client = new NetworkClientV2_3(address)) {
            client.initError(message);
            client.connect();
            client.send(message);
        } catch (NetworkClientExceptionV2 e) { // Execute close method implementing AutoClosable, then execute catch block.
            System.out.println(e.getErrorCode());
        }
    }
}