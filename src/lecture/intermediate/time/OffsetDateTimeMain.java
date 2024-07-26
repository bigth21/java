package lecture.intermediate.time;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("now = " + now);

        OffsetDateTime odt = OffsetDateTime.of(2030, 1, 5, 13, 30, 50, 0, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
    }
}
