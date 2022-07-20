import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        /*Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1s 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerhiem 15 0010 Helsinki");
        System.out.println(ada);
        System.out.println(esko);*/

        /*
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);

        ollie.study();
        System.out.println(ollie);
        */
        /*
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1s 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");


        int i = 0; 
        while( i < 25 ){
            ollie.study();
            i++;
        }
        System.out.println(ollie);
        */

        ArrayList<Person> person = new ArrayList<Person>();
        person.add( new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        person.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(person);


    }

    public static void printPersons(ArrayList<Person> persons){
        for( Person person: persons ){
            System.out.println(person);
        }
        return;
    }
}