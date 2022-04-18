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
        String[][] result = sevenSegmentDisplay.getZero();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", " ", " ", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_oneTest() {
        String[][] result = sevenSegmentDisplay.getOne();
        assertArrayEquals(new String[][]{{" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_twoTest() {
        String[][] result = sevenSegmentDisplay.getTwo();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {"#", " ", " ", " "},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_threeTest() {
        String[][] result = sevenSegmentDisplay.getThree();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_fourTest() {
        String[][] result = sevenSegmentDisplay.getFour();
        assertArrayEquals(new String[][]{{"#", " ", " ", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_fiveTest() {
        String[][] result = sevenSegmentDisplay.getFive();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", " "},
                {"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_sixTest() {
        String[][] result = sevenSegmentDisplay.getSix();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", " "},
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_sevenTest() {
        String[][] result = sevenSegmentDisplay.getSeven();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_eightTest() {
        String[][] result = sevenSegmentDisplay.getEight();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_nineTest() {
        String[][] result = sevenSegmentDisplay.getNine();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", " ", " ", "#"},
                {"#", "#", "#", "#"},
                {" ", " ", " ", "#"},
                {"#", "#", "#", "#"}}, result);
    }
}
