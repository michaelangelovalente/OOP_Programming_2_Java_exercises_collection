
import java.util.HashMap;

public class Program { 
    /*
        public static void printKeys(HashMap<String,String> hashmap), prints all the keys in the hashmap given as a parameter.

        public static void printKeysWhere(HashMap<String,String> hashmap, String text) prints the keys in the hashmap given as a parameter,
        which contain the string given as a parameter.

        public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text), prints the values in the given hashmap whichs keys contain the given string.
    
    */
    /*Prints all the keys in the hashmap given as a parameter. */
    public static void printKeys( HashMap< String, String > hashmap ){
        for( String key : hashmap.keySet() ){
            System.out.println( key );
        }
    }

    /*Prints the keys in the hashmap given as a parameter, which contain the string given as a parameter.*/
    public static void printKeysWhere( HashMap< String, String > hashmap, String test){
        /* need to clean string */
        test  = sanitizeString( test );
        for( String key: hashmap.keySet() ){
            if( key.contains( test )){
                System.out.println( key );
            }
        }
    }

    /*prints the values in the given hashmap which keys contain the given string*/
    public static void printValuesOfKeysWhere( HashMap< String, String > hashmap, String text ){
        text = sanitizeString( text );
        for( String key : hashmap.keySet() ){
            if( key.contains( text ) ){
                System.out.println( hashmap.get( key ) );
            }
        }
    }

    public static String sanitizeString( String string ){
        string = string.trim().toLowerCase();
        return string;
    }

    public static void main(String[] args) {
        // Test your program here!
    }

}
