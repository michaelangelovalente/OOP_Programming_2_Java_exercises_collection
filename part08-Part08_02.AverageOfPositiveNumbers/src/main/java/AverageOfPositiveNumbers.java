import java.util.Scanner;

public class AverageOfPositiveNumbers{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Integer  number = 0, counter = 0;
        while( true ){
            Integer tmp = 0;
            tmp = Integer.valueOf(scanner.nextLine());
            
            if( tmp==0 ){
                break;
            }else if( tmp > 0){
                number += tmp;
                counter++;
            }
        }
        if( counter > 0 ){
            System.out.println((double) number/counter);
        }else{
            System.out.println("Cannot calculate the average.");
        }
        

    }
}
