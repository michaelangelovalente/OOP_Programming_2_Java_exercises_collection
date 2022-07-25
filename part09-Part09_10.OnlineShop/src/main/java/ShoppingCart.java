import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class ShoppingCart{
    private Map<String, Item> map;
    public ShoppingCart(){
        map = new HashMap<>();
    }
    // adds an item to the cart that matches the product given as a parameter, 
    // with the price given as a parameter.
    public void add( String product, int price){ 
        product = sanitizeString(product);
        if( map.containsKey(product) ){
            Item item = map.get(product);
            item.increaseQuantity();
            map.put( product, item);
        }else{
            map.put( product, new Item( product, 1, price) );
        }
    }

    
    //return the total price of the shopping cart
    public int price(){
        int totalPrice = 0;
        if( map.size()  > 0 ){
            Collection<Item> products = map.values();
            for( Item item: products ){
                totalPrice += item.price();
            }
        }
        return totalPrice;
    }

    //prints the item in the shopping cart.
    public void print(){
        Collection<String> keys = map.keySet();
        for( String key : keys ){
            System.out.println(key + ": " + map.get(key).quantity());
        }

    }

    private String sanitizeString(String string){
        return string.trim().toLowerCase();
    }
}