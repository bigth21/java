package lecture.basic.final1;

public class Member {

    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void change(String id, String name) {
//        this.id = id;
        this.name = name;
    }

    public void print() {
        System.out.printf("id:%s, name:%s\n", id, name);
    }
}
