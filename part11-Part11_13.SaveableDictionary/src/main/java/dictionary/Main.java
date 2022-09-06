package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        /*
        SavableDictionary dictionary = new SavableDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("apina", "apfe");
        dictionary.add("ohjelmointi", "programming");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("banana"));

        System.out.println("[=---- -------------- ---------------------=]");

        dictionary.delete("apina");
        dictionary.delete("banana");
        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("banana"));

        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("programming"));
        */

        SaveableDictionary dictionary = new SaveableDictionary("dictionary/words.txt");
        boolean wasSuccessful = dictionary.load();
        if( wasSuccessful ){
            System.out.println("Successfully loaded the dictionary from file.");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));
        
        System.out.println("\nContains: ");
        dictionary.read();
        System.out.println(" ------- ------ ");

        System.out.println("Adding more words.");
        dictionary.add("ohjelmointi", "programming");
        dictionary.add("ohjelmointi-1", "programming-1");
        dictionary.save();



    }
}
