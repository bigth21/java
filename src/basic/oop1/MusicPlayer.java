package basic.oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("Start music player");
    }

    void off() {
        isOn = false;
        System.out.println("Shutdown music player");
    }

    void volumeUp() {
        volume++;
        System.out.println("volume = " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("volume = " + volume);
    }

    void showStatus() {
        System.out.println("Check music player status");
        if (isOn) {
            System.out.println("volume = " + volume);
        } else {
            System.out.println("Music player off");
        }
    }
}
