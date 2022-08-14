public class Book implements Comparable<Book>{
    private String name;
    private int age;

    public Book(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return this.getName() + " (recommended for "+ this.getAge()+" year-olds or older)";
    }

    @Override
    public int compareTo(Book book){
        if( this.getAge() == book.getAge()){
            return this.getName().compareTo( book.getName());
        }
        return this.getAge() - book.getAge();
    }
}

/*
    Alt worse vers.
    
    public class Book{
    private String name;
    private int age;

    public Book(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return this.getName() + " (recommended for "+ this.getAge()+" year-olds or older)";
    }
}
    
    
 */