import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();
        //UserInterface newInterface = new UserInterface(list, scanner);
        //newInterface.start();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        System.out.println();
        list.remove(2);
        list.print();
        System.out.println();
        list.add("buy raisins");
        list.print();
        System.out.println();
        list.remove(1);
        list.remove(1);
        list.print();
    }
}