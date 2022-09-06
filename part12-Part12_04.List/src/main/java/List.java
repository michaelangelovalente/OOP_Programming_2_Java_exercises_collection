public class List<T>{
    //array of values
    private T[] values;
    //first free index
    private int firstFreeIndex;


    //empty constructor
    public List(){
        this.values = (T[]) new Object[10]; //initial size is 10 --< this increases if first free index is == current size by (current Size) + (current Size)/2
        this.firstFreeIndex = 0;
    }

    //add()
    public void add(T value){
        if( firstFreeIndex == values.length ){
            //grow()
            grow();
        }
        values[firstFreeIndex++] = value;
    }

    //grow()
    private void grow(){
        int newSize = this.values.length + (( this.values.length )/2); 
        T[] newValues = (T[]) new Object[newSize];
        for( int i = 0; i < this.values.length; i++ ){
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    //contains()
    public boolean contains(T value){
        return indexOfValue(value) >= 0;
    }

    //indexofvalue()
    public int indexOfValue(T value){
        for( int i = 0; i < firstFreeIndex; i++){
            if( values[i].equals(value ) || values[i]==value ) return i;
        }
        return -1;
    }

    //remove()
    public void remove(T value){
        int indexOfValue = indexOfValue(value);
        if( indexOfValue < 0)return;
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }
    

    private void moveToTheLeft(int fromIndex){
        for( int i = fromIndex; i < firstFreeIndex-1; i++ ){
            this.values[i] = this.values[i+1];
        }
    }

    //value()
    public T value( int index ){
        if( index < 0 || index >= this.firstFreeIndex){
            throw new IndexOutOfBoundsException("Index has to be between 0 and " + (this.firstFreeIndex-1 ));
        }
        return this.values[index];
    }

    //size()
    public int size(){
        return this.firstFreeIndex;
    }

}