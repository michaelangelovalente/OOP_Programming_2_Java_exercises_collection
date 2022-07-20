public class Main{
    public static void main(String args[]){

        /*
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        System.out.println(juice);
        */
        /*
        ProductWarehouse juice = new ProductWarehouse("Juice", 100);
        System.out.println(juice);
        juice.addToWarehouse(900.0);
        System.out.println(juice);
        */

        /*
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        System.out.println(juice);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);

        System.out.println(juice.history());

        */

        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);

        juice.printAnalysis();



    }
}