public class Item{
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    //return the price of the item.
    //You get the items price by multiplying its unit price by its quantity(qty).
    public int price(){
        return this.unitPrice * this.qty;
    }

    public int quantity(){
        return this.qty;
    }
    
    // increases the quantity by one.
    public void increaseQuantity(){
        this.qty++;
    }

    //returns the string representation of the item. 
    // Which must match the format shown in the example below.
    public String toString(){
        return this.product + ": " + this.qty;
    }
    

}