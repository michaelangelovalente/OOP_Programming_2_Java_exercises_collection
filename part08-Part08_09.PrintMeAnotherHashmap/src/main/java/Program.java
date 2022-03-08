
import java.util.HashMap;

public class Program {
    /*In the class Program implement the following class methods:*/

    /*
    public static void printValues(HashMap<String,Book> hashmap), 
    which prints all the values in the hashmap given as a parameter using the toString method of the Book objects.

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text), 
    which prints only the Books in the given hashmap which name contains the given string. You can find out the name of a Book with the method getName.
    */

    /*prints all the values in the hashmap given as a parameter using the toString method of the Book objects.*/
    public static void printValues( HashMap<String, Book> hashmap){
        for( Book book : hashmap.values() ){
            System.out.println( book.toString() );
        }
    }

    /*prints only the Books in the given hashmap which name contains the given string.
    You can find out the name of a Book with the method getName.*/
    public static void printValueIfNameContains( HashMap< String, Book > hashmap, String text ){
        for( Book book : hashmap.values() ){
            String name  = book.getName();
            if( name.contains( sanitizeString( text ) )){
                System.out.println( name );
            }
        }
    }

    public static String sanitizeString( String string ){
        return string.trim().toLowerCase();
    }

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

}
