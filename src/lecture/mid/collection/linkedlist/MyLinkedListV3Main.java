package lecture.mid.collection.linkedlist;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println("stringList = " + stringList);
        String stringAt0 = stringList.get(0);
        System.out.println("itemAt0 = " + stringAt0);

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println("integerList = " + integerList);
        Integer integerAt0 = integerList.get(0);
        System.out.println("integerAt0 = " + integerAt0);
    }
}
