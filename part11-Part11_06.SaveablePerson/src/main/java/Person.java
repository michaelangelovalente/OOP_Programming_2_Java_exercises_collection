public class Person implements Saveable{

    private String name;

    private String address;

    @Override
    public void save(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void load(String address){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}