public class Dog extends Animal implements NoiseCapable {
    //private String name;

    public Dog(){
        super("Dog");
    }

    public Dog(String name){
        super(name);
        //this.name = name;
    }

    public void bark(){
        System.out.println(getName() + " barks");
    }

    @Override
    public void makeNoise(){
        bark();
    }
    /*
    public String getName(){
        return this.name;
    }
     */

}