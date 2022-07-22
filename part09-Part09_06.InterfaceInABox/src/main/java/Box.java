import java.util.ArrayList;

public class Box implements Packable{

    private double maxCapacity;
    //private double weight;
    private ArrayList<Packable> items;

    public Box(double maxCapacity){
        //this.weight = 0;
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item){
        if( weight() + item.weight() <= getMaxCapacity()){
            this.items.add( item );
            //this.weight += item.weight();
        }
    }
    public double getMaxCapacity(){
        return this.maxCapacity;
    }
    @Override
    public double weight(){
        
        double currWeight = 0.0;
        for( Packable item: items){
            currWeight += item.weight();
        }
        return currWeight;
        //return this.weight;
    }

    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + String.format("%.01f kg", weight());
    }
}