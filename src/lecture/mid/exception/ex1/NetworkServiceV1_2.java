package lecture.mid.exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String message) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(message);

        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("Network error occurred(" + connectResult + ")");
            return;
        }
        String sendResult = client.send(message);
        if (isError(sendResult)) {
            System.out.println("Data transmitting error occurred(" + sendResult + ")");
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String result) {
        return !result.equals("success");
    }
}
