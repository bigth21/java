package lecture.intermediate.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        LocalDateTime ofDt = LocalDateTime.of(2016, 6, 16, 8, 10, 1);
        System.out.println("ofDt = " + ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);
        ofDtPlus = ofDt.plusYears(1);
        System.out.println("ofDtPlus = " + ofDtPlus);

        System.out.println("now.isBefore(ofDt) = " + now.isBefore(ofDt));
        System.out.println("now.isAfter(ofDt) = " + now.isAfter(ofDt));
        System.out.println("now.isEqual(ofDt) = " + now.isEqual(ofDt));
    }
}
