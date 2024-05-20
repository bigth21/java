package lecture.mid.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.get(ChronoField.YEAR));
        System.out.println("dt.get(ChronoField.MONTH_OF_YEAR) = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("dt.get(ChronoField.DAY_OF_MONTH) = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("dt.get(ChronoField.HOUR_OF_DAY) = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("dt.get(ChronoField.MINUTE_OF_DAY) = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("dt.get(ChronoField.SECOND_OF_DAY) = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonthValue());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());

        System.out.println("dt.get(ChronoField.MINUTE_OF_DAY) = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("dt.get(ChronoField.SECOND_OF_DAY) = " + dt.get(ChronoField.SECOND_OF_DAY));

    }
}
