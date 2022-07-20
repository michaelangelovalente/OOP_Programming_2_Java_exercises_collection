import java.util.Scanner;

public class UserInterface{
    private TodoList list;
    private Scanner scan;
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scan = scanner;
    }

    public void start(){
         
        while(true){
            System.out.println("Command: ");
            String command = scan.nextLine();

            if( command.toLowerCase().equals("stop"))
                break;
            if( command.toLowerCase().equals("add")){
                System.out.println("To add: ");
                command = scan.nextLine();
                list.add(command);
            }else if( command.toLowerCase().equals("remove")){
                System.out.println("Which one is removed?");
                list.remove( Integer.valueOf(scan.nextLine()));
            }else if( command.toLowerCase().equals("list")){
                
                list.print();
            }
        }   
    }
}