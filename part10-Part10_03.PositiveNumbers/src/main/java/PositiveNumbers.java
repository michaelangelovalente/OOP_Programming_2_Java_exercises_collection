
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        
        List<Integer> test = new ArrayList<>();
        test.add(-1);
        test.add(-1);
        test.add(4);
        test.add(3);
        test.add(-2);
        test.add(-1);
        System.out.println(test);
        System.out.println(positive(test));
    }

    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> positive = numbers.stream()
            .filter( val -> val > 0 )
            .collect(Collectors.toCollection(ArrayList::new));

        return positive;
    }
    /**Better solution
     * public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toList());
    }
     */

}
