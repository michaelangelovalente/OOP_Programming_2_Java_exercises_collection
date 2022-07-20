public class OneItemBox extends Box{

    private boolean containsItem;
    private Item item;
    public OneItemBox(){
        this.containsItem = false;
        
    }

    public void add(Item item){
        if( this.containsItem == false ){
            this.item = item;
            this.containsItem = true;
        }
    }

    public  boolean isInBox(Item item){
        if( containsItem == true ){
            return this.item.equals(item);
        }
        return false;
    }


}