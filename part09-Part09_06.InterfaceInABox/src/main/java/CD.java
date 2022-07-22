public class CD implements Packable{

    private String artist;
    private String nameOfTheCD;
    private int publicationYear;

    public CD(String artist, String nameOfTheCD, int publicationYear){
        this.artist = artist;
        this.nameOfTheCD = nameOfTheCD;
        this.publicationYear = publicationYear;
    }
    
    @Override
    public double weight(){
        return 0.1;
    }

    public String getArtist(){
        return this.artist;
    }

    public String getNameOfTheCD(){
        return this.nameOfTheCD;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    public String toString(){
        return getArtist() + ": " + getNameOfTheCD() + " (" + getPublicationYear() + ")";
    }
}   