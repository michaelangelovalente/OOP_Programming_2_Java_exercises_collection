
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    // You should presume that the book files are in the following format:
    // name,publishing year,page count,author
    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();
        try{
            Files.lines( Paths.get(file))
                .map( row-> row.split(","))
                .filter(row -> row.length >= 4)
                .map( book -> new Book( book[0].trim(), Integer.valueOf(book[1]), Integer.valueOf(book[2]), book[3].trim() ))
                .forEach( book-> books.add(book));
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return books;
    }

    //Better solution
    /**
    public static List<Book> readBooks(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return new ArrayList<>();
    }
     */
}
