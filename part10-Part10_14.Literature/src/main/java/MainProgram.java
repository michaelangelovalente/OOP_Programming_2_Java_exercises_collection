
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while( true ){
            String name;
            int age;
            System.out.print("Input the name of the book, empty stops: ");
            name = scanner.nextLine();
            if( name.equals(""))break;
            System.out.print("Input the age recommendation: ");
            age = Integer.valueOf(scanner.nextLine());
            books.add( new Book( name, age ));
        }

        System.out.println(books.size() + " books in total.");

        books.stream()
            .sorted()
            .forEach( book -> System.out.println(book));
            
        
    }

}

/*
 Alt Worse vers.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while( true ){
            String name;
            int age;
            System.out.print("Input the name of the book, empty stops: ");
            name = scanner.nextLine();
            if( name.equals("")){ break ; }
            System.out.print("Input the age recommendation: ");
            age = Integer.valueOf(scanner.nextLine());

            books.add( new Book( name, age));

        }

        System.out.println( books.size() + " books in total.");

        //Sort based on age.
        Comparator<Book> comparator = Comparator
            .comparing(Book::getAge )
            .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        System.out.println();

        books.stream()
            .forEach( book -> System.out.println(book) );
        
    }

}

 */