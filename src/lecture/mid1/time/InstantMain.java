package lecture.mid1.time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);
        Instant nowFromEpoch = Instant.ofEpochSecond(now.getEpochSecond());
        System.out.println("nowFromEpoch = " + nowFromEpoch);

        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
    }
}
