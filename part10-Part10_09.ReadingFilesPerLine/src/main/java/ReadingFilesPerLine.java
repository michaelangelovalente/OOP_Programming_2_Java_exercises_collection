
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        //List<String> file = read("file.txt");
        List<String> file = read(args[0]);
        //System.out.println(file);
        file.stream().forEach( str -> System.out.println(str));
        
    }
    
    public static List<String> read(String file){
        List<String> rows = new ArrayList<>();
        try{
            //Files.lines() --> returns a stream
            Files.lines( Paths.get( file )).forEach( row -> rows.add(row) );
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return rows;
    }

    //better alternative
    /*
    public static List<String> read(String file){
        try{
            return Files.lines(Paths.get(file)).collect(Collectors.toList());
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return new ArrayList<>();
    }
     */

}
