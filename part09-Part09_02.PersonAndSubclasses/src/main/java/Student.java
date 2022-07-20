public class Student extends Person{
    private Integer credits;
    public Student(){
        super(null,null);
        this.credits = 0;
    }

    public Student(String name, String address){
        super(name,address);
        this.credits = 0;
    }

    public Student(String name, String address, Integer credits){
        super( name, address );
        this.credits = credits;
    }


    public int credits(){
        return this.credits;
    }
    public void study(){
        this.credits++;
    }

    @Override
    public String toString(){
        return super.toString() + "\n  " + "Study credits " + this.credits;
    }

}