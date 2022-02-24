
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();

        while (true) {
            System.out.print("First: " + cont1.contains() + "/100\n" + "Second: " + cont2.contains() + "/100\n");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            
            if( parts[0].equals( "add" ) ){
                cont1.add( Integer.valueOf( parts[1] ) );
            }else if( parts[0].equals( "move" ) ){
                cont1.moveFrom( cont2, Integer.valueOf( parts[1] ) );
            }else if( parts[0].equals( "remove" ) ){
                cont2.remove( Integer.valueOf( parts[1] ) );
            }

        }
    }

}
