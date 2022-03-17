package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void tvPowerTest(){
        Television tv = new Television();
//        tv.isOn(1);
        assertTrue(tv.isOn(1));
        assertFalse(tv.isOn(0));
    }

    @Test
    public void setChannelTest() {
        Television tv = new Television();
        tv.setChannel(101);
//        tv.changeChannelForward();
//        tv.changeChannelForward();
//        tv.changeChannelBackward();
//        tv.changeChannelBackward();
        assertEquals(15, tv.getChannel());
    }

    @Test
    public void changeChannelTest() {
        Television tv = new Television();
        tv.changeChannelForward();
        tv.changeChannelForward();
        tv.changeChannelForward();
        tv.changeChannelForward();
        tv.changeChannelBackward();
        assertEquals(3, tv.getChannel());
    }

    @Test
    public void volumeTest() {
        Television tv = new Television();
        for(int i=0; i<5; i+=1) {
            tv.increaseVolume();
        }
        tv.decreaseVolume();
//        tv.mute();
        assertEquals(4, tv.getVolume());
    }
}
