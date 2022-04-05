package chapterThree;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = new Clock();

        clock.time(4, 35, 50);
        clock.displayTime();
        System.out.println();

        clock.setHour(23);
        clock.setMinute(59);
        clock.setSecond(59);
        clock.displayTime();
    }
}
