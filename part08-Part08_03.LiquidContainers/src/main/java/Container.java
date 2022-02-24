public class Container{
    private Integer liters;
    public Container(){
        this.liters = 0;
    }


    public void add( int val ){
        if( val > 0 ){
            this.liters += val;
            if( this.liters >= 100 ){
                this.liters = 100;
            } 
        }
        
    }

    public int remove( int val ){
        this.liters -= val;
        if( this.liters < 0 ){
            int tmp = this.liters;
            this.liters = 0;
            return val + tmp;
        }
        return val;
    }

    public void moveFrom( Container src, int val ){
        src.add( this.remove( val ) );
    }

    public Integer contains( ){
        return this.liters;
    }
}