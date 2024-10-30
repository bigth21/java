package lecture.advanced1.util;

import static lecture.advanced1.util.MyLogger.log;

public abstract class ThreadUtils {
    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            log("Interrupted, " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
