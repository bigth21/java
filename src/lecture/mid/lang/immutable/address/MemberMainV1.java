package lecture.mid.lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        var address = new Address("서울");

        MemberV1 member1 = new MemberV1("name1", address);
        MemberV1 member2 = new MemberV1("name2", address);

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        member2.getAddress().setValue("부산");

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);
    }
}
