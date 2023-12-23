package lecture.basic.construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            String message = String.format("name:%s age:%d grade:%d", member.name, member.age, member.grade);
            System.out.println(message);
        }
    }
}
