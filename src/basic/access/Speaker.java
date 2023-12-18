package basic.access;

public class Speaker {

    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    public void volumeUp() {
        if (volume >= 100) {
            System.out.println("Max volume");
        } else {
            volume += 10;
            System.out.println("Increase 10");
        }
    }

    public void volumeDown() {
        volume -= 10;
        System.out.println("Invoke volumeDown");
    }

    public void showVolume() {
        System.out.println("volume = " + volume);
    }
}
