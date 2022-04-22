import java.util.HashMap;
import java.util.ArrayList;


public class VehicleRegistry{
    private HashMap< LicensePlate, String > registry;
    public VehicleRegistry(  ){
        this.registry = new HashMap<>();
    }


    // Assigns the owner it received as a parameter  to a 
    // car that correspons to the license plate received as 
    // as a parameter.

    // If the licenseplate doesn't have an owner, the method returns true.

    // If the license already has an owner attached, the method returns false
    // and does nothing.
    public boolean add( LicensePlate licensePlate, String owner){
        if( registry.get( licensePlate) == null ){ // the license does not have an owner attached to it
            registry.put( licensePlate, owner );
            return true;
        }
        return false;
    }

    // returns the owner of the car corresponding to the license plate
    // received as a parameter. If the car isn't in the registry, the
    // method returns null.
    public String get(LicensePlate licensePlate){
        return registry.get(licensePlate);
    }


    // removes the license plate
    // and attached data from the registry.

    // The method returns true if removed successfully and false
    // if the license plate wasn't in the registry.
    public boolean remove( LicensePlate licensePlate ){
        if( registry.containsKey(licensePlate)){
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    
    // public void printLicensePlates() prints the license plates in the registry
    public void printLicensePlates(){
        for ( LicensePlate liPlates : this.registry.keySet() ) {
            System.out.println(liPlates.toString());
        }
    }

    // public void printOwners() prints the owners of the cars in the registry.
    // Each name should only be printed once, even if a particular person owns more than one car.
    public void printOwners(){
        ArrayList <String> tmp = new ArrayList<>();
        for( String liPlatesOwners : this.registry.values()){

            if( !tmp.contains( liPlatesOwners )){
                System.out.println( liPlatesOwners );
                tmp.add( liPlatesOwners);
            }
            
        }
    }
    
}