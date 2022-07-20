import java.util.HashMap;
public class Abbreviations{
    private HashMap<String, String> abbreviations;
    public Abbreviations(){
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        if( hasAbbreviation( explanation )){
            return;
        }
        abbreviation = sanitizeString( abbreviation );
        explanation = sanitizeString( explanation );
        abbreviations.put( abbreviation, explanation);
        
    }

    public boolean hasAbbreviation( String abbreviation ){
        if( abbreviations.containsKey(sanitizeString(abbreviation))){
            return true;
        }
        return false;
    }


    public String findExplanationFor(String abbreviation){
        abbreviation = sanitizeString(abbreviation);
        if( hasAbbreviation( abbreviation )){
            return abbreviations.get( abbreviation );
        }
        return null;
    }
    public String sanitizeString( String string ){
        return string.toLowerCase().trim();
    }
}