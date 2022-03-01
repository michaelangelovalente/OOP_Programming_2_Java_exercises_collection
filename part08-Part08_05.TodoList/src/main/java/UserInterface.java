import java.util.Scanner;

public class UserInterface{
    private TodoList myList;
    private Scanner scan;
    public UserInterface( TodoList myList, Scanner scan ){
        this.myList = myList;
        this.scan = scan;
    }

    public void start(){
        /*
        The text UI works with an eternal looping statement (while-true), 
        and it must offer the following commands to the user:

        
        
        The commmand list prints all the tasks on the to-do list.
        The command remove asks the user to enter the id of the task to be removed. When this has been entered, the specified task should be removed from the list of tasks.
        */

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
            }

           
            
        }
    }
}