import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility{

    private HashMap< String, ArrayList<String>> storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }


    // public void add( String unit, String item)
    // add the parameter item to the storage unit that is also given as a paramenter.
    public void add( String unit, String item ){
        this.storage.putIfAbsent( unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    // public ArrayList<String> contents(String storageUnit)
    //returns a list that contains all the items in the storage unit
    //indicated by the parameter. If there is no such storage
    //unit or it contains no items, the method should return an empty list.
    public ArrayList<String> contents( String storageUnit){
        ArrayList<String> retStorage = this.storage.get( storageUnit );
        if( retStorage == null || retStorage.isEmpty()  ){
            this.storage.putIfAbsent( storageUnit, new ArrayList<>());
            retStorage = this.storage.get(storageUnit);
        }
        return retStorage;
    }

    //removes the given item from the given storage unit. NB! Only removes one item 
    // -if there are several items with the same name, the rest still remain.
    // If the storage unit would be empty after the removal, the method also removes
    // the unit.
    public void remove( String storageUnit, String item){
        ArrayList <String> currUnit = this.storage.get( storageUnit );
        if(  currUnit != null  ){
            currUnit.remove( item );
            if( currUnit.isEmpty() ){
                this.storage.remove( storageUnit );
            }

        }   
        return;
    }

    // returns the names of the storage units as a list.
    public ArrayList<String> storageUnits(){
        ArrayList<String> listOfUnits = new ArrayList<> ();
        for( String units : this.storage.keySet()){
            listOfUnits.add( units );
        }
        return listOfUnits;
    }

}