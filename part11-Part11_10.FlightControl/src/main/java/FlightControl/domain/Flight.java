package FlightControl.domain;

public class Flight {
    private Place departure;
    private Place destination;
    private Plane airplane;

    public Flight(Place departure, Place destination, Plane airplane){
        this.departure = departure;
        this.destination = destination;
        this.airplane = airplane;
    }



    public Place getDeparture() {
        return this.departure;
    }


    public Place getDestination() {
        return this.destination;
    }


    public Plane getAirplane() {
        return this.airplane;
    }

    public String toString(){
        return this.airplane + " (" + this.departure.getName() +"-" + this.destination.getName() +")" ;
    }


}