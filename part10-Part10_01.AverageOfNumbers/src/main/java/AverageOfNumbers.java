import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop." );
        while( true ){
            String row = scanner.nextLine();
            if( row.equals("end")){
                break;
            }
            inputs.add(row);
        }

        Double average = inputs.stream()
            .mapToInt( val -> Integer.valueOf(val))
            .average()
            .getAsDouble();
        System.out.println("average of the numbers: " + average);  

    }
}
