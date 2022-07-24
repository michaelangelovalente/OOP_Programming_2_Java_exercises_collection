import java.util.List;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here
        
        List<String> name = new ArrayList<>();
        name.add("First");
        name.add("Second");
        name.add("Third");
        System.out.println(returnSize(name));
        System.out.println();


        List<String> name2  = new ArrayList<>();
        name2.add("First");
        name2.add("Second");
        name2.add("Third");
        System.out.println(returnSize(name2));

    }

    public static int returnSize( List list ){
        return list.size();
    }
    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
}
