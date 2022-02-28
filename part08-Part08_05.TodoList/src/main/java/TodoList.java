import java.util.ArrayList;

public class TodoList{
    private ArrayList <String>  items ;

    public TodoList(){
        this.items = new ArrayList<String> () ;
    }
    /*
    public void add(String task) - add the task passed as a parameter to the todo list.
    public void print() - prints the exercises. Each task has a number associated with it on the print statement — use the task's index here (+1).
    public void remove(int number) - removes the task associated with the given number; the number is the one seen associated with the task in the print.
    */

    /*public void add(String task) - add the task passed as a parameter to the todo list.*/
    public void add( String task ){
        for( String item: items ){
            if( task.equals( item )){
                break;
            }else if( !(item.equals( items.get( items.size()-1 )) )) {
                /*task is not present in task. We can add it without duplicates*/
                
            };
        }
    }
}