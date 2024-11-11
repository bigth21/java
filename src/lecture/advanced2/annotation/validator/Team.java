package lecture.advanced2.annotation.validator;

public class Team {
    @NotEmpty
    private String name;
    @Range(min = 1, max = 10)
    private int memberCount;

    public Team(String name, int memberCount) {
        this.name = name;
        this.memberCount = memberCount;
    }

    public String getName() {
        return name;
    }

    public int getMemberCount() {
        return memberCount;
    }
}
