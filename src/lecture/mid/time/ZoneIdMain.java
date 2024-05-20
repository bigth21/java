package lecture.mid.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId.getId() = " + zoneId.getId());
            System.out.println("zoneId.getRules() = " + zoneId.getRules());
        }

        ZoneId systemDefault = ZoneId.systemDefault();
        System.out.println("systemDefault = " + systemDefault);

        ZoneId zoneId = ZoneId.of("Asia/Seoul");
        System.out.println("zoneId = " + zoneId);
    }
}
