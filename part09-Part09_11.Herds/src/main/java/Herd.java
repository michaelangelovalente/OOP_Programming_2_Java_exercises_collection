import java.util.ArrayList;

public class Herd implements Movable{
    
    private ArrayList<Movable> herd;

    public Herd(){
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        if( !this.herd.contains(movable)){
            this.herd.add(movable);
        }
        
    }

    public void move(int dx, int dy){
        for( Movable organism: this.herd){
            organism.move(dx,dy);
        }
    }
    
    public ArrayList<Movable> getHerd(){
        return this.herd;
    }

    @Override
    public String toString(){
        String str = "";
        for( Movable organism: this.herd ){
            str += organism +"\n";
        }

        return str;
    }
}