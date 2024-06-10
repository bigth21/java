package lecture.mid.collection.set;

public class MyHashSetMainV0 {
    public static void main(String[] args) {
        var set = new MyHashSetV0();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println("set = " + set);

        var added = set.add(4);
        System.out.println("added = " + added);

        System.out.println("set.contains(3) = " + set.contains(3));
        System.out.println("set.contains(99) = " + set.contains(99));
    }
}
