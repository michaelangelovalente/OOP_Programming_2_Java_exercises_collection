import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<>();
        String row;
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            row = scanner.nextLine();  
            if( row.equals("end") ){
                break;
            }
            inputs.add(row);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers?\n(n/p)");
        row = scanner.nextLine();
        Double avg = 0.0;  
        if( row.equals("p")){
            avg = inputs.stream()
            .mapToInt(val-> Integer.valueOf(val))
            .filter( val -> val >= 0 )
            .average()
            .getAsDouble();
        }else if( row.equals("n")){
            avg = inputs.stream()
            .mapToInt( val -> Integer.valueOf(val))
            .filter(val -> val < 0)
            .average()
            .getAsDouble();
        }
        
        System.out.println("Average of the positive numbers: " + avg);
        


    }
}
