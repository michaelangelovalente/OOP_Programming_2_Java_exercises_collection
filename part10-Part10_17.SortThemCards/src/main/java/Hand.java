
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    public void print(){
        Iterator<Card> iterator = this.cards.iterator();
        while( iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void sort(){
        Collections.sort(this.cards);
    }

    public ArrayList<Card> getHand(){
        return this.cards;
    }
    
    public int compareTo(Hand hand){
        int hand1 = 0, hand2 = 0;
        Iterator<Card> iterator1 = this.cards.iterator();
        Iterator<Card> iterator2 = hand.getHand().iterator();

        while( iterator1.hasNext() || iterator2.hasNext() ){
            if( iterator1.hasNext() ){
                hand1 += iterator1.next().getValue();
            }
            if( iterator2.hasNext() ){
                hand2 += iterator2.next().getValue();
            }
        }

        return hand1 - hand2;
    }

    public void sortBySuit(){
        //BySuitInValueOrder bsivo = new BySuitInValueOrder();
        //Collections.sort(cards, bsivo);
        Collections.sort(cards, new BySuitInValueOrder());
    }

}