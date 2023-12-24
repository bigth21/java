package lecture.basic.final1;

public class ConstantMain2 {

    public static void main(String[] args) {
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int userCount) {
        System.out.println("userCount = " + userCount);
        if (userCount > Constant.MAX_USERS) {
            System.out.println("Register user on the waiting list");
        } else {
            System.out.println("Participate game");
        }
    }
}
