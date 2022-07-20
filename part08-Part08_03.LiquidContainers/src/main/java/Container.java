public class Container{
    private int amount;
    public Container(){
        this.amount = 0; 
    }

    public void add(Integer amount ){
        if( amount > 0 ){
            this.amount += amount;
        }

        if( this.amount > 100 ){
            this.amount = 100;
        }
    }

    public Integer remove( Integer removeAmount ){
        int output = 0;
        if( removeAmount > 0 ){
            output = removeAmount;
            if( this.amount - removeAmount < 0 ){
                output = this.amount;
                this.amount = 0;
            }else{
                this.amount -= removeAmount;
            }
        }
        return output;
    }
    public Integer currentAmount(){
        return this.amount;
    }

}