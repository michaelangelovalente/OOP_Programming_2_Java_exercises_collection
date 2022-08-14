
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    //Sort by suit and then by value.
    public int compare(Card c1, Card c2){
        SortBySuit sortBySuit = new SortBySuit();
        int suitOrder = sortBySuit.compare( c1, c2);
        if( suitOrder == 0 ){
            return c1.getValue() - c2.getValue();
        }
        return suitOrder;
    }
}