
import java.util.Scanner;
//import 

public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String userIn = scanner.nextLine();
        Checker check = new Checker();

        if( check.isDayOfWeek(userIn) || check.allVowels(userIn)){
            System.out.println("The form is correct.");
        }else{
            System.out.println("The form is incorrect.");
        }
        
    }
}
