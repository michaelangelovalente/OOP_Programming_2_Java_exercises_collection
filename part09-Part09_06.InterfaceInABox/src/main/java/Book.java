
public class Book implements Packable{
    private String author;
    private String nameOfTheBook;
    private double weightOfTheBook;

    public Book( String author, String nameOfTheBook, double weightOfTheBook ){
        this.author = author;
        this.nameOfTheBook = nameOfTheBook;
        this.weightOfTheBook = weightOfTheBook;
    }

    @Override
    public double weight(){
        return this.weightOfTheBook;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getNameOfTheBook(){
        return this.nameOfTheBook;
    }

    public double getWeightOfTheBook(){
        return this.weightOfTheBook;
    }

    public String toString(){
        return getAuthor() +": "+ getNameOfTheBook(); 
    }
    
}