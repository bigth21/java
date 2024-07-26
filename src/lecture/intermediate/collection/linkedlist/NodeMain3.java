package lecture.intermediate.collection.linkedlist;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println(lastNode.item);

        int index = 1;
        Node nodeAtIndex = getNode(first, index);
        System.out.println(nodeAtIndex.item);

        add(first, "D");
        System.out.println("first = " + first);
        add(first, "E");
        System.out.println("first = " + first);
        add(first, "F");
        System.out.println("first = " + first);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node first, String item) {
        getLastNode(first).next = new Node(item);
    }
}
