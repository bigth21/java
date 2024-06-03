package lecture.mid.collection.linkedlist;

public class MyLinkedListV3<E> {
    private Node<E> head;
    private int size = 0;

    public void add(E e) {
        if (head == null) {
            head = new Node<>(e);
        } else {
            getLastNode().next = new Node<>(e);
        }
        size++;
    }

    public void add(int index, E e) {
        Node<E> node = new Node<>(e);
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node<E> prev = getNode(index - 1);
            node.next = prev.next;
            prev.next = node;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> pos = head;
        while (pos.next != null) {
            pos = pos.next;
        }
        return pos;
    }

    public E set(int index, E e) {
        Node<E> pos = getNode(index);
        E oldItem = pos.item;
        pos.item = e;
        return oldItem;
    }

    public E remove(int index) {
        Node<E> node = getNode(index);
        E item = node.item;
        if (index == 0) {
            head = node.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = node.next;
        }
        node.item = null;
        node.next = null;
        size--;
        return item;
    }

    public E get(int index) {
        return getNode(index).item;
    }

    private Node<E> getNode(int index) {
        Node<E> pos = head;
        for (int i = 0; i < index; i++) {
            pos = pos.next;
        }
        return pos;
    }

    public int indexOf(E e) {
        int index = 0;
        for (Node<E> pos = head; pos != null; pos = pos.next) {
            if (e.equals(pos.item))
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

    public static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

//    @Override
//    public String toString() {
//        return "Node{" +
//                "item=" + item +
//                ", next=" + next +
//                '}';
//    }

        @Override
        public String toString() {
            var sb = new StringBuilder();
            Node<E> x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null)
                    sb.append("->");
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}

