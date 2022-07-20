
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: "+first.currentAmount()+"/100" );
            System.out.println("Second: "+second.currentAmount()+"/100" );


            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String parts[] = input.split(" "); 
            if( parts[0].toLowerCase().equals("add")){
                first.add(Integer.valueOf(parts[1]));
            }else if(parts[0].toLowerCase().equals("move")){
                Integer addAmount = first.remove( Integer.valueOf(parts[1]));
                second.add( addAmount );
            }else if( parts[0].toLowerCase().equals("remove")){
                Integer dump = second.remove( Integer.valueOf(parts[1]));
            }

        }
    }

}
