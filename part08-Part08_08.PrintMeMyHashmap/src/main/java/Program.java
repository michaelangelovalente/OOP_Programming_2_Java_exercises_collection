import java.util.HashMap;

public class Program{

    public static void printKeys(HashMap<String, String> hashmap){
        for( String abbreviation: hashmap.keySet()){
            System.out.println(abbreviation);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text){

        for( String abbreviation : hashmap.keySet()){
            if( sanitize(abbreviation).contains( sanitize( text))){
                System.out.println( abbreviation );
            }
        }

    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for( String abbreviation : hashmap.keySet()){
            if( sanitize(abbreviation).contains(sanitize(text)) ){
                System.out.println(hashmap.get(abbreviation));
            }
        }
    }

    public static String sanitize( String string ){
        return string.trim().toLowerCase();
    }

    /* 
    public static void main(String args[]){
        HashMap<String, String> hm = new HashMap();
        hm.put("abcd", "jkl");
        hm.put("def", "mno");
        hm.put("ghi", "pqr");

        printKeysWhere(hm, "a");

    }*/
    
}