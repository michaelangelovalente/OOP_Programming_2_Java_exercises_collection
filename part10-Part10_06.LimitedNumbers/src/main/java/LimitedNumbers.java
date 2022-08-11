import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> userIn = new ArrayList<>();
        while(true){
            String str = scanner.nextLine();
            if(Integer.valueOf(str) < 0){
                break;
            }
            userIn.add(str);
        }

        userIn.stream()
            .map( val -> Integer.valueOf(val))
            .filter(val -> val >= 1 && val <= 5)
            .forEach( val ->System.out.println(val));
        
    }
}

/*
Alternative

public class LimitedNumbers {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<Integer> read = new ArrayList<>();
 
        while (true) {
            int read_current = Integer.valueOf(scanner.nextLine());
 
            if (read_current < 0) {
                break;
            }
 
            read.add(read_current);
        }
 
        read.stream().filter(num -> num >= 1 && num <= 5).forEach(num -> System.out.println(num));
    }
}
 */