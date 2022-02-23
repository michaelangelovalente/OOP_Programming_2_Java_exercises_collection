
import java.util.Scanner;


public class Cubes {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        String userIn;

        while( true ){
            userIn = scan.nextLine();
            if( ( userIn.equals( "end" )) ){
                break;
            }
            System.out.println( (int) Math.pow( (double) Integer.valueOf( userIn ), 3.0 ));
        }
        
    }
}
