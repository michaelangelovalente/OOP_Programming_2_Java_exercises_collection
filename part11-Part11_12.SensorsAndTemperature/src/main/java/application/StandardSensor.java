package application;

public class StandardSensor implements Sensor {

    private int sensorValue;
    //private boolean isOn;


    public StandardSensor(int sensorValue){
        this.sensorValue = sensorValue;
        //this.isOn = true;
    }

    // returns true if the sensor is on        
    public boolean isOn(){
        return true;
    }

    // sets the sensor on
    public void setOn(){
        //std.sens is always on.
    }

    // sets the sensor off
    public void setOff(){
       //std.sens is always on. 
    }

    // returns the value of the sensor if it's on
    // if the sensor is not on throw a IllegalStateException
    public int read(){
        return this.sensorValue;
    }
    
}
