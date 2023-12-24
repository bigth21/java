package lecture.basic.final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int userCount) {
        System.out.println("userCount = " + userCount);
        if (userCount > 1000) {
            System.out.println("Register user on the waiting list");
        } else {
            System.out.println("Participate game");
        }
    }
}
