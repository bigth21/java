package basic.oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("Start music player");

        volume++;
        System.out.println("volume = " + volume);

        volume++;
        System.out.println("volume = " + volume);

        volume--;
        System.out.println("volume = " + volume);

        System.out.println("Check music player");
        if (isOn) {
            System.out.println("volume = " + volume);
        } else {
            System.out.println("Music player is off");
        }

        isOn = false;
        System.out.println("Music player is off");
    }
}
