import java.util.Scanner;

public class Store{

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner){
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    //This method handles customer's vist in the store.
    public void shop(String customer){
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for( String product : this.warehouse.products()){
            System.out.println(product);
        }

        while(true){
            System.out.println("What to put in the cart (press enter to go the register and pay): ");
            String product = scanner.nextLine();
            if( product.isEmpty()){
                break;
            }


            //Adds the product to the cart
            //We first check if the product is available in the warehouse.
            product = product.trim().toLowerCase();
            if( warehouse.take( product ) ){
                //we add one to the shoppingcart and we reduce the stock in the warehouse
                Item currentItem = new Item( product, 1, warehouse.price(product) );
                cart.add(product, currentItem.price()); // modify this to add item instead of the detail of the item!
            }
            /*
            if( warehouse.stock( product ) > 0){
                //we add one to the shoppingcart and we reduce the stock in the warehouse
                Item currentItem = new Item( product, 1, warehouse.price(product) );
                cart.add(product, currentItem.price()); // modify this to add item instead of the detail of the item!
            }
             */
            /*else{
                System.out.println("The item is not available.");
            }*/

        }

        System.out.println("your shoppingcart contents: ");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}