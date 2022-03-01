import java.util.Scanner;

public class UserInterface{
    private TodoList myList;
    private Scanner scan;
    public UserInterface( TodoList myList, Scanner scan ){
        this.myList = myList;
        this.scan = scan;
    }

    public void start(){
    

        while( true ){
            System.out.print("Command: ");
            String command = this.scan.nextLine();
            if( command.equals( "stop" ) ){
                break;
            }else if( command.equals( "add" ) ){
                System.out.print("To add: ");
                myList.add( this.scan.nextLine( ) );
            }else if( command.equals( "list" ) ){
                myList.print();
            }else if( command.equals( "remove" ) ){
                System.out.print( "Which one is removed?" );
                this.myList.remove( Integer.valueOf( scan.nextLine() ) );
            }

           
            
        }
    }
}