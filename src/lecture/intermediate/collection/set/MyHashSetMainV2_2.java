package lecture.intermediate.collection.set;

public class MyHashSetMainV2_2 {
    public static void main(String[] args) {
        var member1 = new Member("member1");
        var member2 = new Member("member2");
        var member3 = new Member("member3");
        var member4 = new Member("member4");

        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
        System.out.println("member3.hashCode() = " + member3.hashCode());
        System.out.println("member4.hashCode() = " + member4.hashCode());

        var set = new MyHashSetV2();
        set.add(member1);
        set.add(member2);
        set.add(member3);
        set.add(member4);
        System.out.println("set = " + set);

        var target = new Member("member2");
        System.out.println("set.contains(target) = " + set.contains(target));
    }
}
