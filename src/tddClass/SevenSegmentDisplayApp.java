package tddClass;

public class SevenSegmentDisplayApp {
    public static void main(String[] args) {
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        sevenSegmentDisplay.setScreen("11100111");
        sevenSegmentDisplay.display();
    }
}
