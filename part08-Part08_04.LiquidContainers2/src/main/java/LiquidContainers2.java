
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1, cont2;
        cont1 = new Container();
        cont2 = new Container();

        while (true) {
            /*System.out.print("> ");*/
            System.out.println("First: " + cont1.toString());
            System.out.println("Second: " + cont2.toString() +"\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");
            int val = Integer.valueOf( parts[1] );
            if( parts[0].equals( "add" )){
                cont1.add( val ) ;
            }else if( parts[0].equals( "remove" ) ){
                cont2.remove( val );
            }else if( parts[0].equals( "move" ) ){
                if( cont1.contains() < val ){
                    val = cont1.contains();
                }
                cont1.remove( val );
                cont2.add( val );
            }

        }
    }

}
