package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {

    @Test
    public void turnOnTest() {
        AirCondition panasonic = new AirCondition();
        panasonic.acSwitch(1);
        assertEquals(true, panasonic.acSwitch(1));
    }

    @Test
    public void turnOffTest() {
        AirCondition panasonic = new AirCondition();
        panasonic.acSwitch(0);
        assertEquals(false, panasonic.acSwitch(0));
    }

    @Test
    public void increaseTemperatureTest() {
        AirCondition panasonic = new AirCondition();
        panasonic.increaseTemperature(20);
        assertEquals(21, panasonic.getTemperature());
    }

    @Test
    public void decreaseTemperatureTest() {
        AirCondition panasonic = new AirCondition();
        panasonic.decreaseTemperature(20);
        assertEquals(19, panasonic.getTemperature());
    }

    @Test
    public void temperatureBeyond30Test() {
        AirCondition panasonic = new AirCondition();
        panasonic.increaseTemperature(30);
        assertEquals(30, panasonic.getTemperature());
    }

    @Test
    public void temperatureBelow16Test() {
        AirCondition panasonic = new AirCondition();
        panasonic.decreaseTemperature(16);
        assertEquals(16, panasonic.getTemperature());
    }
}
