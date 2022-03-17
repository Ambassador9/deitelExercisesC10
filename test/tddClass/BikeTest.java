package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {

    @Test
    public void bikeSwitchTest() {
        Bike suzuki = new Bike();
        suzuki.isOn(1);
        assertEquals(true, suzuki.isOn(1));

        suzuki.isOn(0);
        assertEquals(false, suzuki.isOn(0));
    }

//    @Test
//    public void turnOffTest() {
//        Bike suzuki = new Bike();
//        suzuki.isOn(0);
//        assertEquals(false, suzuki.isOn(0));
//    }

//    @Test
//    public void accelerateGearTest() {
//        Bike suzuki = new Bike();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        //gearTwo, max=29
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        //gearThree, max=40
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        suzuki.accelerateGear();
//        //gearFour, max=47
//        suzuki.accelerateGear();
//        //gearFour, min=39
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        //gearThree, min=30
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        //gearTwo, min=20
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        //gearOne, min=0
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        suzuki.deccelerateGear();
//        assertEquals(0, suzuki.getSpeed());
//
//
//        suzuki.accelerateGear();
//        assertEquals(16, suzuki.getSpeed());
//
//        suzuki.accelerateGear();
//        assertEquals(26, suzuki.getSpeed());
//
//        suzuki.accelerateGear();
//        assertEquals(38, suzuki.getSpeed());
//
//        suzuki.accelerateGear();
//        assertEquals(48, suzuki.getSpeed());
//    }



//    @Test
//    public void deccelerateGearTest() {
//        Bike suzuki = new Bike();
//        suzuki.deccelerateGear();
//        assertEquals(14, suzuki.getSpeed());
//
//        suzuki.deccelerateGear();
//        assertEquals(22, suzuki.getSpeed());
//
//        suzuki.deccelerateGear();
//        assertEquals(32, suzuki.getSpeed());
//
//        suzuki.deccelerateGear();
//        assertEquals(40, suzuki.getSpeed());
//    }


    @Test
    public void autoGearTest() {
        Bike suzuki = new Bike();
        //gearOne, max=20
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        //gearOne-gearTwo, max=29
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        //gearTwo-gearThree, max=40
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        suzuki.accelerateGear();
        //gearFour, max=47
        suzuki.accelerateGear();
        //gearFour-gearThree, min=39
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        //gearThree-gearTwo, min=30
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        //gearTwo-gearOne, min=20
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        //gearOne, min=0
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        suzuki.deccelerateGear();
        assertEquals("gearOne", suzuki.getGear());
    }

}
