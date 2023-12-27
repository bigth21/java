package thread;

/**
 * Daemon thread
 */
public class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadEx10());
        thread.setDaemon(true);
        thread.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);

            if (i == 5) {
                autoSave = true;
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {}
            if (autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("File is auto-saved");
    }
}
