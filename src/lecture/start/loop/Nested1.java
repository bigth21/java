package lecture.start.loop;

public class Nested1 {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i);
                System.out.println("j = " + j);
            }
            System.out.println("외부 for 종료 i: " + i);
            System.out.println();
        }
    }
}
