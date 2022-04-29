package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.PresentationDirection;

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
        String[][] result = sevenSegmentDisplay.turnOn(1);
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {"#", "#", "#", "#"},
                {"#", "#", "#", "#"},
                {"#", "#", "#", "#"},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_aTest() {
        String[][] result = sevenSegmentDisplay.getA();
        assertArrayEquals(new String[][]{{"#", "#", "#", "#"},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}}, result);
    }

    @Test
    public void sevenSegmentDisplay_bTest() {
        String[][] result = sevenSegmentDisplay.getB();
        assertArrayEquals(new String[][]{{" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}}, result);
    }

    @Test
    public void sevenSegmentDisplay_cTest() {
        String[][] result = sevenSegmentDisplay.getC();
        assertArrayEquals(new String[][]{{" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"},
                {" ", " ", " ", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_dTest() {
        String[][] result = sevenSegmentDisplay.getD();
        assertArrayEquals(new String[][]{{" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {"#", "#", "#", "#"}}, result);
    }

    @Test
    public void sevenSegmentDisplay_eTest() {
        String[][] result = sevenSegmentDisplay.getE();
        assertArrayEquals(new String[][]{{" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {"#", " ", " ", " "},
                {"#", " ", " ", " "},
                {"#", " ", " ", " "}}, result);
    }

    @Test
    public void sevenSegmentDisplay_fTest() {
        String[][] result = sevenSegmentDisplay.getF();
        assertArrayEquals(new String[][]{{"#", " ", " ", " "},
                {"#", " ", " ", " "},
                {"#", " ", " ", " "},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}}, result);
    }

    @Test
    public void sevenSegmentDisplay_gTest() {
        String[][] result = sevenSegmentDisplay.getG();
        assertArrayEquals(new String[][]{{" ", " ", " ", " "},
                {" ", " ", " ", " "},
                {"#", "#", "#", "#"},
                {" ", " ", " ", " "},
                {" ", " ", " ", " "}}, result);
    }

//    @Test
//    public void validateSevenSegmentDisplayWith_characterOne() {
//        String[][] result = sevenSegmentDisplay.setScreen("11110111");
//    }
}
