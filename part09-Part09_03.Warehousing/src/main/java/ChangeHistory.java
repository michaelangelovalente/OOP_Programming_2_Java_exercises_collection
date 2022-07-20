import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory{
    private ArrayList<Double> amountChanges;
    public ChangeHistory(){
        amountChanges = new ArrayList<Double>();
    
    }
    /*
    // solution without using collections
    public double maxValue(){
        double maxV = this.amountChanges.get(0);
        for( double val : amountChanges ){
            if( val > maxV){
                maxV = val;
            }
        }
        return maxV;
    }
    */
    public void add(double status){
        amountChanges.add(status);
    }

    public void clear(){
        amountChanges.clear();
    }


    
    public String toString(){
        return amountChanges.toString();
    }

    public double maxValue(){
        double output = 0;
        if( amountChanges.size() > 0){
            output = Collections.max(amountChanges);
        }
        return output; 
    }

    public double minValue(){
        double min = 0.0;
        if( amountChanges.size() > 0){
            min = Collections.min(amountChanges);
        }
        return min;
    }

    public double average(){
        double totalAmount = 0.0;
        if( amountChanges.size() > 0){
            for( double amount : amountChanges ){
                totalAmount += amount;
            }
        }
        return totalAmount/amountChanges.size();
        
    }

}