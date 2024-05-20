package lecture.mid.lang.immutable.ex;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2002, 05, 05);
        ImmutableMyDate date2 = date1;

        date1 = date1.withYear(2025);

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
