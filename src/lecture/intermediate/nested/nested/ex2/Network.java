package lecture.intermediate.nested.nested.ex2;

public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {
        private final String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println("content = " + content);
        }
    }
}
