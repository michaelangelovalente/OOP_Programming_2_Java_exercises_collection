import java.util.Scanner;

public class Cubes{
    public static void main(String args[]){
        Scanner scan = new Scanner( System.in );
        String in;
        while( true ){
            in = scan.nextLine();
            if( in.toLowerCase().equals("end") ){ 
                break; 
            }
            System.out.println( (int) Math.pow( Integer.valueOf(in), 3) );
        }
    }
}