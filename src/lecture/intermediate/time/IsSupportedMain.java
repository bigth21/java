package lecture.intermediate.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute = " + minute);
        }
    }
}