
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees{
    ArrayList<Person> persons;

    public Employees(){
        this.persons = new ArrayList<>();
    }


    public void add(Person personToAdd){
        this.persons.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        Iterator<Person> iterator = peopleToAdd.iterator();
        while( iterator.hasNext() ){
            this.persons.add( iterator.next() );
        }

    }

    public void print(){
        Iterator<Person> iterator = this.persons.iterator();
        while( iterator.hasNext() ){
            System.out.println(iterator.next());
        }
    }

    public void print(Education education){
        Iterator<Person> iterator = this.persons.iterator();
        while( iterator.hasNext() ){
            Person person = iterator.next();
            //education.getName()
            if( person.getEducation() == education ){
                System.out.println(person);
            }
        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = this.persons.iterator();
        while( iterator.hasNext()){
            if( iterator.next().getEducation() == education){
                iterator.remove();
            }
        }
    }

}