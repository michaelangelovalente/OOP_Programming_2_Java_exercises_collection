import java.util.ArrayList;
public class TodoList{

    private ArrayList<String> list;
    public TodoList( ){
        this.list = new ArrayList<String>();
    }

    public void add(String task){
        if( !task.equals("")){
            this.list.add(task);
        }
    }

    public void remove(int task){
        list.remove(task-1);
    }
    
    public void print(){
        
        for( int i = 0; i < list.size(); i++ ){
            System.out.println((i+1)+": "+list.get(i));
        }
        
    }

}