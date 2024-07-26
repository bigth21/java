package lecture.intermediate.collection.linkedlist;

public class MyLinkedListV2 {
    private Node head;
    private int size = 0;

    public void add(Object o) {
        if (head == null) {
            head = new Node(o);
        } else {
            getLastNode().next = new Node(o);
        }
        size++;
    }

    public void add(int index, Object o) {
        Node node = new Node(o);
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node prev = getNode(index - 1);
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }

    private Node getLastNode() {
        Node pos = head;
        while (pos.next != null) {
            pos = pos.next;
        }
        return pos;
    }

    public Object set(int index, Object o) {
        Node pos = getNode(index);
        Object oldItem = pos.item;
        pos.item = o;
        return oldItem;
    }

    public Object remove(int index) {
        Node node = getNode(index);
        Object item = node.item;
        if (index == 0) {
            head = node.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = node.next;
        }
        node.item = null;
        node.next = null;
        size--;
        return item;
    }

    public Object get(int index) {
        return getNode(index).item;
    }

    private Node getNode(int index) {
        Node pos = head;
        for (int i = 0; i < index; i++) {
            pos = pos.next;
        }
        return pos;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node pos = head; pos != null; pos = pos.next) {
            if (o.equals(pos.item))
                return index;
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}

