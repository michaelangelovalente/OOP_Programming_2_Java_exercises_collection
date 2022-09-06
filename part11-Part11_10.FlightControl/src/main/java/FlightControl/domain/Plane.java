package FlightControl.domain;

public class Plane {
    private String identifier;
    private int capacity;

    public Plane(String identifier, int capacity){
        this.identifier = identifier;
        this.capacity = capacity;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString(){
        return getIdentifier() + " (" + getCapacity() + " capacity)";
    }

}
