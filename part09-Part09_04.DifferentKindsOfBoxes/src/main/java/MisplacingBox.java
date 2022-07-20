import java.util.ArrayList;
public class MisplacingBox extends Box{

    ArrayList<Item> items;
    public MisplacingBox(){
        this.items = new ArrayList<Item>();
    }

    public void add(Item item){
        this.items.add(item);

    }

    public boolean isInBox(Item item){
        return false;
    }


}