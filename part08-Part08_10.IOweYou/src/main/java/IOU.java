import java.util.HashMap;

public class IOU{
    /*
    constructor public IOU() creates a new IOU

    public void setSum(String toWhom, double amount)
    saves the amount owed and the person owed to to the IOU.

    public double howMuchDoIOweTo(String toWhom)
    returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.
    */
    private HashMap< String, Double > amount;
    public IOU(){
        this.amount = new HashMap<>();
    }

    
    /*saves the amount owed and the person owed to to the IOU.*/
    public void setSum( String toWhom, double amount){
        this.amount.put( toWhom.trim(), amount);
    }

    /*returns the amount owed to the person whose name is given as a parameter. 
    If the person cannot be found, it returns 0.*/
    public double howMuchDoIOweTo(String toWhom){
        toWhom = toWhom.trim();
        return this.amount.getOrDefault( toWhom, 0.0 ) ;
    }

}