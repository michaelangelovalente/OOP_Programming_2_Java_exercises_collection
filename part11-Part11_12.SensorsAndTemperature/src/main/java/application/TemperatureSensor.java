package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean isOn;
    private int currentTemperature;

    public TemperatureSensor(){
        this.isOn = false;
        this.currentTemperature = 0;
    }

    // returns true if the sensor is on
    public boolean isOn(){
        return isOn;
    }    
       // sets the sensor on
    public void setOn(){
        this.isOn = true;
    }   

    // sets the sensor off
    public void setOff(){
        this.isOn = false;
    }

    // returns the value of the sensor if it's on
    // if the sensor is not on throw a IllegalStateException
    public int read() throws IllegalArgumentException{
        if( !isOn ){
            throw new IllegalArgumentException("TemperatureSensor-read(): Sensor is off.");
        }
        return currentTemperature = new Random().nextInt(61)-30;
    }        
    
}
