
import java.util.Queue;
import java.util.LinkedList;


public class Pipe<T> {

    public Queue<T> pipe;

    public Pipe(){
        this.pipe = new LinkedList<>();
    }


    public void putIntoPipe(T value){
        this.pipe.add(value);
    }

    public T takeFromPipe(){
        return this.pipe.poll();
    }

    public boolean isInPipe(){
        return this.pipe.isEmpty();
    }

}
