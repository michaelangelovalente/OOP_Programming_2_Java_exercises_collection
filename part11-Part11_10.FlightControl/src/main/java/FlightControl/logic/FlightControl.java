package FlightControl.logic;

import java.util.HashMap;
import java.util.Collection;

import FlightControl.domain.Plane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

public class FlightControl {
    //Two parts:
    // - The user enters information about airplanes and flights in the airport asset-control
    // - The program offers the flight information service. This has three operations
    //      - Printing the airplanes
    //      - Printing the flights
    //      - Printing the information of a single airplane.
    //
    // The user may exit the program by choosing the option x

    
    private HashMap<String, Plane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;
    
    public FlightControl(){
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String identifier, int capacity){
        this.airplanes.putIfAbsent(identifier, new Plane(identifier, capacity));
    }

    public void addFlight( Plane airplane, String departure, String destination){

        this.places.putIfAbsent( departure, new Place(departure));
        this.places.putIfAbsent( destination, new Place(destination));
        
        Flight flight = new Flight(this.places.get(departure), this.places.get(destination), airplane );
        this.flights.put( flight.toString(), flight );
    }

    //used for: print airplanes
    public Collection<Plane> getAirplanes(){
        return this.airplanes.values();
    }

    //used for: print flights
    public Collection<Flight> getFlights(){
        return this.flights.values();
    }

    public Plane getAirplane(String airplaneIdentifier){
            return this.airplanes.get(airplaneIdentifier);
    }
}
