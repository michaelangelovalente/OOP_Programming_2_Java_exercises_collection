package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class SaveableDictionary {
    
    private Map<String,String> finnish;
    private Map<String,String> otherLanguage;
    private String file;

    public SaveableDictionary(){
        this.finnish = new HashMap<>();
        this.otherLanguage = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this.finnish = new HashMap<>();
        this.otherLanguage = new HashMap<>();
        this.file = file;
    }

    public boolean save(){
        try{
            PrintWriter writer = new PrintWriter(this.file);
            this.finnish.keySet().stream()
                .forEach( key -> {
                    writer.println(key+":"+this.finnish.get(key));
                });
                writer.close();
            
        }catch(Exception e){
            return false;
        }
        
        return true;
    }
    /*
     *
     * 
     * public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
     * 
      private void saveWords(PrintWriter writer) throws IOException {
        List<String> allreadySaved = new ArrayList<>();
        words.keySet().stream().forEach(word -> {
            if (allreadySaved.contains(word)) {
                return;
            }
 
            String pari = word + ":" + words.get(word);
            writer.println(pari);
 
            allreadySaved.add(word);
            allreadySaved.add(words.get(word));
        });
    }
     * 
     * 
     */
    public boolean load(){
        //System.out.println(this.file);
        try{
            Scanner scanner = new Scanner(  Paths.get( this.file ));
            while( scanner.hasNextLine()){
                
                String parts[] = scanner.nextLine().split(":");
                add(parts[0], parts[1]);
                //System.out.println("Added " + parts[0] +":" + parts[1] );
            }
        }catch(Exception e){
            return false;
        }
        return true;
    }
    /*
     * public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(l -> l.split(":"))
                    .forEach(parts -> {
                        this.words.put(parts[0], parts[1]);
                        this.words.put(parts[1], parts[0]);
                    });
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
     */

    public void read(){
        this.finnish.keySet().stream()
            .forEach( key -> System.out.println( key + " : " + this.finnish.get(key)));
    }

    public void delete(String word){
        if( this.finnish.containsKey(word)){
            deleteFromMap(this.finnish, this.otherLanguage, word);
        }else if( this.otherLanguage.containsKey(word)){
            deleteFromMap( this.otherLanguage, this.finnish, word);
        }
        return;
    }

    /*
     * Adds a word to the dictionary.
     * Every word has just one translation,
     * and if the same word is added for the second time, nothing happens.
     */
    public void add(String words, String translation){
        finnish.putIfAbsent(words, translation);
        otherLanguage.putIfAbsent( translation, words);
    }


    

    //takes for granted that Map contains key
    private  void  deleteFromMap(Map<String, String> map1, Map<String, String> map2 , String key){
        String val = map1.get(key);
        map1.remove(key);
        map2.remove(val);
    }

    /**
     * 
     * Returns the translation for the given word.
     * If the word is not in the dictionary, returns null.
     * 
    */
    public String translate(String word){
        if ( finnish.containsKey(word)){
            return finnish.getOrDefault( word, null);
        }
        return otherLanguage.getOrDefault(word, null);
    }

    


}
