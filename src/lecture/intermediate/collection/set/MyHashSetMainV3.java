package lecture.intermediate.collection.set;

public class MyHashSetMainV3 {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        String target = "A";
        boolean contains = set.contains(target);
        System.out.println("contains = " + contains);

        set.remove(target);
        System.out.println("set = " + set);
    }
}
