package lecture.mid.collection.set;

public class MyHashSetMainV2_1 {
    public static void main(String[] args) {
        var set = new MyHashSetV2();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println("set = " + set);

        System.out.println("\"A\".hashCode() = " + "A".hashCode());
        System.out.println("\"B\".hashCode() = " + "B".hashCode());
        System.out.println("\"AB\".hashCode() = " + "AB".hashCode());
        System.out.println("\"SET\".hashCode() = " + "SET".hashCode());

        String target = "SET";
        System.out.println("set.contains(target) = " + set.contains(target));
    }
}
