
public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Abbreviations  abb = new Abbreviations();
        abb.addAbbreviation("e.g.","for example");
        abb.addAbbreviation("etc.","and so on");
        abb.addAbbreviation("i.e","more precisely");


        String text = "e.g. i.e etc. lol";
        for( String part : text.split(" ")){
            
            if( abb.hasAbbreviation(part)){
                System.out.println(part);
                System.out.println( abb.findExplanationFor(part));
            }
        }
    }
}

