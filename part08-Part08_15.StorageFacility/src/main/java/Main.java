import java.util.ArrayList;
public class Main{
    public static void main(String args[]){
        /*StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14","ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        System.out.print("Storage units: ");
        System.out.println( facility.storageUnits());

        System.out.print("Unit - a14: ");
        System.out.println( facility.contents("a14"));
        System.out.print("Unit - f156: ");
        System.out.println( facility.contents("f156") + "\n");

        //-------
        facility.remove("f156", "rollerblades");

        System.out.print("Unit - a14: ");
        System.out.println( facility.contents("a14"));
        System.out.print("Unit - f156: ");
        System.out.println( facility.contents("f156") + "\n");

        facility.remove("f156", "rollerblades");

        System.out.print("Unit - a14: ");
        System.out.println( facility.contents("a14"));
        System.out.print("Unit - f156: ");
        System.out.println( facility.contents("f156") + "\n");

        System.out.print("Storage units: ");
        System.out.println( facility.storageUnits());*/

        System.out.println("\nNew unit starts here.");

        StorageFacility unit = new StorageFacility();
        unit.add("a111","mouse");
        unit.add("a111","cheese");
        unit.add("b123","projector");
        unit.add("g63","ice skates");
        System.out.print("\nStorage Units: " + unit.storageUnits() + "\n" );

        for( String storUnit: unit.storageUnits() ){
            System.out.println(storUnit + ": " + unit.contents(storUnit));
        }

        unit.remove("g63","ice skates");
        ArrayList<String> newTest = unit.contents("g63");

    }
}