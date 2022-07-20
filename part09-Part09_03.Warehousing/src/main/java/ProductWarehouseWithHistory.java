public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory balanceHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super( productName, capacity);
        super.addToWarehouse(initialBalance);
        balanceHistory = new ChangeHistory();
        this.balanceHistory.add(initialBalance);
    }

    public String history(){
        return balanceHistory.toString();
    }

    public void addToWarehouse(double amount){
        if( amount > 0 ){
            super.addToWarehouse(amount);
            balanceHistory.add(super.getBalance());            
        }
        
    }


    public double takeFromWarehouse(double amount){
        double outputAmount = 0;
        if( amount > 0 ){
            outputAmount = super.takeFromWarehouse(amount);
            balanceHistory.add(super.getBalance());
        }
        return outputAmount;
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + balanceHistory.maxValue());
        System.out.println("Smallest amount of product: " + balanceHistory.minValue());
        System.out.println("Average: " + String.format("%.1f", balanceHistory.average()));

    }

}