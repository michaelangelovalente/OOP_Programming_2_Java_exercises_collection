
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap< String, String > nickN = new HashMap<>();

        String extract[] = {"matthew's nickname is matt", "michael's nickname is mix", "arthur's nickname is artie"};
        for( String sentence : extract ){
            String namesAndNicks[] = sentence.split( "'s nickname is " );
            nickN.put( namesAndNicks[0] , namesAndNicks[1] );
        }
        
    }

}
