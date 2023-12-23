package lecture.basic.construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.printf("name:%s age:%d grade:%d\n", member.name, member.age, member.grade);
        }
    }
}
