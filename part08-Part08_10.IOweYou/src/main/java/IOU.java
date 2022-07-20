import java.util.HashMap;

public class IOU{

    HashMap<String, Double>  iou;

    public IOU(){
        this.iou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom ){
        return this.iou.getOrDefault(toWhom, 0.0);
    }
    
}