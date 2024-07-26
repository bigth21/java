package lecture.intermediate.collection.set;

public class MyHashSetMainV1 {
    public static void main(String[] args) {
        var set = new MyHashSetV1();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println("set = " + set);

        int targetNumber = 99;
        System.out.println("contains(buckets, targetNumber) = " + set.contains(targetNumber));
        System.out.println("set.remove(99) = " + set.remove(99));
        System.out.println("set = " + set);
    }
}
