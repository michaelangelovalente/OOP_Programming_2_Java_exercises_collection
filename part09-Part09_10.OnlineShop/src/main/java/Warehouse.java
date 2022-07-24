import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse{

    private Map<String, Integer> products;
    private Map<String, Integer> stock;

    public Warehouse(){
        this.products = new HashMap<>();
        this.stock = new HashMap<>();
    }

    //adds a product to the warehouse with the price and stock balance given as parameters.
    public void addProduct(String product, int price, int stock){
        product = sanitizeString(product);
        if( !products.containsKey(product) ){
            this.products.put(product, price);
            this.stock.put(product, stock);
        }
    }

    //returns the price of the product it received as a parameter.
    //If the product hasn't been added to the warehouse, the method must return -99.
    public int price( String product){
        
        Integer productVal = products.get(sanitizeString(product));
        if( productVal != null ){
            return productVal;
        }
        return -99;
    }

    //returns the current remaining stock of the product in the warehouse.
    //If the product hasn't been added to the warehouse, the method must return 0.
    public int stock(String product){
        Integer remainingStock = stock.get(sanitizeString( product ));
        if( remainingStock != null){
            return remainingStock;
        }
        return 0;
    }
    //reduces the stock remaining for the product it received as a parameter by one, 
    // and returns true if there was stock remaining.
    // If the product was not available in the warehouse the method returns false. 
    // A products stock can't go below
    public boolean take(String product){
        product = sanitizeString( product );
        Integer currentStock = this.stock.get(product);
        
        if( currentStock != null ){
            currentStock--;
            if( currentStock >= 0 ){
                this.stock.put(product, currentStock);
                return true;    
            }
        }
        return false;
    }

    //returns the names of the products in the warehouse as a Set
    public Set<String> products(){
        return products.keySet();
    }

    private String sanitizeString(String string){
        return string.trim().toLowerCase();
    }


}