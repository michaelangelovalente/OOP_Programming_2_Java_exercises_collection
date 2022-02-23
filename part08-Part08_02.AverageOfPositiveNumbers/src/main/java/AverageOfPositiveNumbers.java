
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer  num = 0, den = 0;
        
        while( true ){
            Integer tmp = Integer.valueOf( scanner.nextLine() ) ;
            if( tmp == 0){
                break;
            }else if( tmp > 0){
                num += tmp;
                den++;
            }            
        }

        if( num <= 0 ){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println( ((double) num) / den );
        }

    }
}
