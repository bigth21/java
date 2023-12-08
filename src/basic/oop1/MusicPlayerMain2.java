package basic.oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("Start music player");

        data.volume++;
        System.out.println("volume = " + data.volume);

        data.volume++;
        System.out.println("volume = " + data.volume);

        data.volume--;
        System.out.println("volume = " + data.volume);

        System.out.println("Check music player");
        if (data.isOn) {
            System.out.println("volume = " + data.volume);
        } else {
            System.out.println("Music player is off");
        }

        data.isOn = false;
        System.out.println("Music player is off");
    }
}
