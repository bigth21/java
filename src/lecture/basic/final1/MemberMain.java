package lecture.basic.final1;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.change("myId2", "seo");
        member.print();
    }
}
