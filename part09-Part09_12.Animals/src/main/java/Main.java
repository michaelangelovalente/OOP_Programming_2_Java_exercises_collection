
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        /*Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();*/
        /*
        Cat cat = new Cat();
        cat.purr();
        cat.eat();
        cat.sleep();

        Cat garfield = new Cat("Garfield");
        garfield.purr();
         */
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        System.out.println(cat.getClass());
        Cat c = (Cat)cat;
        c.makeNoise();
        System.out.println(c.getClass());

    }

}
