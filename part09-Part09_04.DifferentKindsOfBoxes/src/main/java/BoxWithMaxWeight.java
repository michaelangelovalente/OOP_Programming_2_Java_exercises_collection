import java.util.ArrayList;
public class BoxWithMaxWeight extends Box{
    private int capacity;
    //private int currentWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        // defines max weight allowed for that box
        this.capacity = capacity; 
        //this.currentWeight = 0;
        items = new ArrayList<>();
    }

    @Override
    public void add( Item item){
        int currWeight = 0;
        for( Item itemInBox : items ){
            currWeight += itemInBox.getWeight();
        }
        if( ( item.getWeight() + currWeight <= this.getCapacity()) ){
            items.add( item );
            //this.addWeight( item.getWeight());
        }
    }

    public boolean isInBox(Item item){
        return items.contains( item );
    }

    public int getCapacity(){
        return this.capacity;
    }
    /*
    public int getCurrentWeight(){
        return this.currentWeight;
    }
    

    public void addWeight(int weight){
        this.currentWeight += weight;
    }
     */
    
}