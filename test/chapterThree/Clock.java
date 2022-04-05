package chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public void time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour > 23) {
            this.hour = 0;
        }

    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute > 59) {
            this.minute = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second > 59) {
            this.second = 0;
        }
    }

    public void displayTime() {
        System.out.printf("%d:%d:%d", hour, minute, second);
    }
}
