package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SevenSegmentDisplayTest {
    private SevenSegmentDisplay sevenSegmentDisplay;

    @BeforeEach
    public void setUp() {
        sevenSegmentDisplay = new SevenSegmentDisplay();
    }

    @Test
    public void sevenSegmentDisplay_arrayCanBeCreatedTest() {
        assertNotNull(sevenSegmentDisplay);
    }

    @Test
    public void sevenSegmentDisplaySwitchTest() {
        assertTrue(sevenSegmentDisplay.turnOn(1));
    }

    @Test
    public void sevenSegmentDisplay_zeroTest() {
        String[][] result = sevenSegmentDisplay.displayZero();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", " ", " ", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_oneTest() {
        String[][] result = sevenSegmentDisplay.displayOne();
        assertArrayEquals(new String[][]{{" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_twoTest() {
        String[][] result = sevenSegmentDisplay.displayTwo();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {"#", " ", " ", " "},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_threeTest() {
        String[][] result = sevenSegmentDisplay.displayThree();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_fourTest() {
        String[][] result = sevenSegmentDisplay.displayFour();
        assertArrayEquals(new String[][]{{"#", " ", " ", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_fiveTest() {
        String[][] result = sevenSegmentDisplay.displayFive();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", " "},
                {"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_sixTest() {
        String[][] result = sevenSegmentDisplay.displaySix();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", " "},
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_sevenTest() {
        String[][] result = sevenSegmentDisplay.displaySeven();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_eightTest() {
        String[][] result = sevenSegmentDisplay.displayEight();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_nineTest() {
        String[][] result = sevenSegmentDisplay.displayNine();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }
}
