package lecture.start.loop;

public class NestedEx2 {

    public static void main(String[] args) {
        int rows = 2;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
