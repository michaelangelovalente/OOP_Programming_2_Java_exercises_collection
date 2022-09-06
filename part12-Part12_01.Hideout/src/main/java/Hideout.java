public class Hideout<T> {
    T item;

    public Hideout(){
        item = null;
    }


    public void putIntoHideout(T toHide){
        this.item = toHide;
    }

    public T takeFromHideout(){
        T output = this.item;
        this.item = null;
        return output;
    }

    public boolean isInHideout(){
        return this.item != null;
    }

}
