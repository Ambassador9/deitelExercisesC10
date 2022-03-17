package tddClass;

public class Television {

    private int channel;
    private int volume;

    public boolean isOn(int flip) {
        if(flip == 1) return true;
        return false;
    }

    public void setChannel(int digit) {
        if(digit >= 0 && digit <= 100) channel = digit;
    }

    public void changeChannelForward() {
        channel += 1;
    }

    public void changeChannelBackward() {
        channel -= 1;
    }

    public int getChannel() {
        return channel;
    }

    public void increaseVolume() {
        if(volume >= 0 && volume <= 20) volume += 1;
    }

    public void decreaseVolume() {
        if(volume > 0 && volume <= 20) volume -= 1;
    }

    public int getVolume() {
        return  volume;
    }

    public void mute() {
        volume = 0;
    }
}
