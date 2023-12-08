package basic.oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);

        volumeUp(data);

        volumeDown(data);

        showStatus(data);

        off(data);
    }

    private static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("Music player is off");
    }

    private static void showStatus(MusicPlayerData data) {
        System.out.println("Check music player");
        if (data.isOn) {
            System.out.println("volume = " + data.volume);
        } else {
            System.out.println("Music player is off");
        }
    }

    private static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("volume = " + data.volume);
    }

    private static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("volume = " + data.volume);
    }

    private static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("Start music player");
    }
}
