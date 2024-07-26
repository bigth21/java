package lecture.intermediate.exception.ex3;

import lecture.intermediate.exception.ex3.exception.ConnectionExceptionV3;
import lecture.intermediate.exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    public void sendMessage(String message) {
        String address = "http://example.com";
        var client = new NetworkClientV3(address);
        client.initError(message);
        try {
            client.connect();
            client.send(message);
        } catch (ConnectionExceptionV3 e) {
            System.out.println("Connection Error: " + e.getAddress() + ", Message: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("Send Error: " + e.getSendData() + ", Message: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Error: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
