package lecture.mid.collection.linkedlist;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        list.add("a");
        list.add("b");
        list.add("c");

        list.add(0, "d");
        System.out.println("list = " + list);

        list.remove(0);
        System.out.println("list = " + list);

        list.add(1, "e");
        System.out.println("list = " + list);

        list.remove(1);
        System.out.println("list = " + list);
    }
}