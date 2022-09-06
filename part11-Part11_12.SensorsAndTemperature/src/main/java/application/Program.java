package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:
        /*
        StandardSensor ten = new StandardSensor(10);
        StandardSensor minusFive = new StandardSensor(-5);


        System.out.println(ten.read());
        System.out.println(minusFive.read());
         */
        /*
        Sensor kumpula = new TemperatureSensor();
        kumpula.setOn();
        System.out.println("Temperature in Kumpula " + kumpula.read() + " degree Celsius");


        Sensor kaisaniemi = new TemperatureSensor();
        
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        //helsinkiRegion.setOn(); 
        System.out.println("---------------");
        helsinkiRegion.showSensors();
        System.out.println("---------------");
        System.out.println("---------------");
        helsinkiRegion.setOn();
        System.out.println("---------------");
        helsinkiRegion.showSensors();
        System.out.println("---------------");
        System.out.println("---------------");
        
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
         */

        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();

        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        System.out.println("---------------");
        helsinkiRegion.showSensors();
        System.out.println("---------------");
        System.out.println("---------------");
        helsinkiRegion.setOn();
        System.out.println("---------------");
        helsinkiRegion.showSensors();
        System.out.println("---------------");
        System.out.println("---------------");

        //helsinkiRegion

        System.out.println("Temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("Temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("Temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");


        System.out.println("Readings: " + helsinkiRegion.readings() );

    }

}
