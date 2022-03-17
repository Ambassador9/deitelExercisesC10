package tddClass;

public class Bike {

    private int speed;
    private String autoGear;

    public boolean isOn(int flip) {
        if(flip == 1) return true;
        return false;
    }

    public void accelerateGear() {
        if(speed <= 20) {
            speed = speed + 1;
            autoGear = "gearOne";
        }
        if((speed > 20) && (speed <= 30)) {
            speed = speed + 2;
            autoGear = "gearTwo";
        }
        if((speed > 30) && (speed <= 40)) {
            speed = speed + 3;
            autoGear = "gearThree";
        }
        if(speed > 40) {
            speed = speed + 4;
            autoGear = "gearFour";
        }
    }


    public void deccelerateGear() {
        if(speed <= 20) {
            speed = speed - 1;
            autoGear = "gearOne";
        }
        if((speed > 20) && (speed <= 30)) autoGear = "gearTwo"; {
            speed = speed - 2;
        }
        if((speed > 30) && (speed <= 40)) autoGear = "gearThree"; {
            speed = speed - 3;
        }
        if(speed > 40) {
            speed = speed - 4;
            autoGear = "gearFour";
        }
    }

    public int getSpeed() { return speed; }

    public String getGear() { return autoGear; }
}
