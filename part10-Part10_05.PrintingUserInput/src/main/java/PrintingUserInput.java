
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userIn = new ArrayList<>();
        

        while(true){
            String input = scanner.nextLine();
            if( input.equals("") ){
                break;
            }
            userIn.add(input);
        }

        userIn.stream()
            .forEach( str -> System.out.println(str));

    }
}
