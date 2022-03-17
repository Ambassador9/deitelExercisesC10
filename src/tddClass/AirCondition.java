package tddClass;

public class AirCondition {

    private int temperature;

    public boolean acSwitch(int flip) {
        if(flip == 1) return true;
        return false;
    }

    public void increaseTemperature(int currentTemperature) {
        if(currentTemperature >= 30) temperature = 30;
        if(currentTemperature < 30) temperature = currentTemperature + 1;
    }


    public void decreaseTemperature(int currentTemperature) {
        if(currentTemperature <= 16) temperature = currentTemperature;
        if(currentTemperature > 16) temperature = currentTemperature - 1;
    }

    public int getTemperature() { return temperature; }
}
