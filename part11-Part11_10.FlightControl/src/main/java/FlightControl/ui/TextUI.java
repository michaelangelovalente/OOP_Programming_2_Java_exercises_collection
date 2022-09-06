package FlightControl.ui;

import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;

import FlightControl.logic.FlightControl;
import FlightControl.domain.Plane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;


public class TextUI {

    FlightControl flightControl = new FlightControl();
    Scanner scanner;

    public TextUI(Scanner scanner){
        this.scanner = scanner;
    }


    public void start(){
        airportAssetControlApp();
        flightControlApp();
    }

    private void airportAssetControlApp(){

        while(true){
            
            //System.out.println("\nChoose an action:");
            System.out.println("Airport Asset Control");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String userIn = scanner.nextLine();
            
            if( userIn.equals("1")){
                System.out.print("Give the airplane id: ");
                String id = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                Integer capacity = Integer.valueOf(scanner.nextLine());
                flightControl.addAirplane( id, capacity);

            }else if( userIn.equals("2")){
                System.out.print("Give the airplane id: ");
                Plane plane = flightControl.getAirplane(scanner.nextLine());
                System.out.print("Give the departure airport id: ");
                String departure = scanner.nextLine();
                System.out.print("Give the target airport id: ");
                String destination = scanner.nextLine();
                flightControl.addFlight(plane, departure, destination);

            }else if( userIn.toLowerCase().equals("x")){
                break;
            }

        }

    }

    private void flightControlApp(){
        while(true){

            //System.out.println("\nChoose an action:");
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String userIn = scanner.nextLine();

            if( userIn.equals("1")){
                Collection<Plane> airplanes = flightControl.getAirplanes();
                Iterator<Plane> iterator = airplanes.iterator();
                while( iterator.hasNext() ){
                    System.out.println(iterator.next());
                }

            }else if( userIn.equals("2")){
                Iterator<Flight> flights = flightControl.getFlights().iterator();
                while( flights.hasNext()){
                    Flight flight = flights.next();
                    System.out.println(flight.getAirplane() + " (" + flight.getDeparture().getName()+"-"+flight.getDestination().getName()+")");
                }
            }else if( userIn.equals("3")){
                System.out.print("Give the airplane id: ");
                String airplaneId = scanner.nextLine();
                System.out.println(flightControl.getAirplane(airplaneId));
            }else if( userIn.toLowerCase().equals("x")){
                break;
            }

        }
    }


}
