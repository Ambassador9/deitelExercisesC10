package chapterEight;

import java.sql.Time;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public Clock() {
        this(0, 0, 0);
    }

    public Clock(int second) {
        this(0,0, second);
    }

    public Clock(int minute, int second) {
        this(0, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    private void validate(int hour, int minute, int second) {
        validateHourWith(hour);
        validateMinuteWith(minute);
        validateSecondWith(second);
    }

    private void validateSecondWith(int second) {
        boolean secondIsInvalid = second < 0 || second >= 60;
        if(secondIsInvalid) throw new IllegalArgumentException("Invalid second");
    }

    private void validateMinuteWith(int minute) {
        boolean minuteIsInvalid = minute < 0 || minute >= 60;
        if(minuteIsInvalid) throw new IllegalArgumentException("Invalid minute");
    }

    private void validateHourWith(int hour) {
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if(hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
    }
}
