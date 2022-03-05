import java.util.HashMap;

public class Abbreviations{
    /*
    DONE
    Create a class Abbreviations for managing common abbreviations.
    The class must have a constructor, which does not take any parameters. 
    The class must also provide the following methods:

    DONE
    public void addAbbreviation(String abbreviation, String explanation) 
    adds a new abbreviation and its explanation.

    DONE
    public boolean hasAbbreviation(String abbreviation) 
    checks if an abbreviation has already been added; 
    returns true if it has and false if it has not.

    DONE
    public String findExplanationFor(String abbreviation)
    finds the explanation for an abbreviation; 
    returns null if the abbreviation has not been added yet.

    */

    private HashMap<String, String > abbreviations;
    public Abbreviations(){
        this.abbreviations = new HashMap<String, String>();
    }

    public void addAbbreviation( String abbreviation, String explanation ){
        this.abbreviations.put( sanitizedString( abbreviation ), sanitizedString( explanation ) );
    }

    public boolean hasAbbreviation( String abbreviation ){
        String explain = this.abbreviations.get( sanitizedString( abbreviation ) );
        if( explain == null ){
            return false;
        }
        return true;
    }

    public String findExplanationFor( String abbreviation ){
        return this.abbreviations.get( sanitizedString( abbreviation ) );
    }

    public static String sanitizedString( String string ){
        if( string  == null ){
            return "";
        }
        return string.trim().toLowerCase();
    }

    
}