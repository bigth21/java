package lecture.basic.final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Date date = new Date();

        date.value = 10;
        System.out.println("date = " + date.value);
        date.value = 20;
        System.out.println("date = " + date.value);
    }
}
