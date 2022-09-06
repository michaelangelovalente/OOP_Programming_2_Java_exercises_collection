package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class AverageSensor implements Sensor {

    //private boolean isOn;
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        //this.isOn = false;
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public List<Integer> readings(){
        return this.readings;
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
        if( !(toAdd.isOn()) && isOn()){
            setOff();
        }
    }

    // returns true if the sensor is on
    public boolean isOn(){
        Iterator<Sensor> iterator = this.sensors.iterator();
        while( iterator.hasNext()){
            if( !iterator.next().isOn()) return false;
        }
        return true;
    }    

    // sets the sensor on
    public void setOn(){
           
        Iterator<Sensor> iterator = sensors.iterator();
        while( iterator.hasNext() ){
            iterator.next().setOn();
        }
        
    }

    // sets the sensor off
    public void setOff(){
    
        Iterator<Sensor> iterator = sensors.iterator();
        while( iterator.hasNext()  ){
            Sensor currentSensor = iterator.next();
            if( currentSensor.isOn() ){
                currentSensor.setOff();
            }
        }
        

        
    }     

    public void showSensors(){

        //testing 'setOff() method'
        System.out.println("\nList of sensors:");
        for( int i = 0 ; i < this.sensors.size(); i++ ){
            System.out.print( "sensor number: " + i + " is ");
            if( this.sensors.get(i).isOn() ){
                System.out.println(" on.");
            }else{
                System.out.println(" off.");
            }
        }

    }

    // returns the value of the sensor if it's on
    // if the sensor is not on throw a IllegalStateException
    public int read() throws IllegalStateException {
        if( this.sensors.size() < 1 || !isOn()){
            throw new IllegalStateException("Average sensor is off.");
        }
        int avg = (int) Math.floor(this.sensors.stream()
        .mapToInt( sensorVal ->  (Integer)sensorVal.read() )
        .average()
        .getAsDouble());
        
        this.readings.add(avg);

        return avg;
    }
}
