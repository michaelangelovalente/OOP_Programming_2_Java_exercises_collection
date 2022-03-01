import java.util.ArrayList;

public class TodoList{
    private ArrayList <String>  items ;

    public TodoList(){
        this.items = new ArrayList<String> () ;
    }
    
    private boolean contains( String task ){
            for( String item : this.items ){
                if( task.equals( item ) ){
                    return true;
                }
            }
            return false;
    }
    /*public void add(String task) - add the task passed as a parameter to the todo list.*/
    public void add( String task ){
        if( !contains( task )){
            this.items.add( task );
        }
        
    }

    public void print(){
        for( int i = 0 ; i < this.items.size(); i++ ){
            System.out.println( (i+1) + ": " + this.items.get(i) );
        }
    }

    /*public void remove(int number) - removes the task associated with the given number; 
    the number is the one seen associated with the task in the print.*/
    public void remove(int number){
        this.items.remove( number-1 );
    }
}