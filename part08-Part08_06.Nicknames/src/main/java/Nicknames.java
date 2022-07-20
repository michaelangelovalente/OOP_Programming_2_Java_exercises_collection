import java.util.HashMap;
//import java.util.Scanner;

public class Nicknames{
    public static void main(String[] args){

        HashMap<String, String> nickname = new HashMap<>();
        nickname.put("matthew", "matt");
        nickname.put("michael", "mix");
        nickname.put("arthur", "artie");

        System.out.println(nickname.get("matthew"));
        System.out.println(nickname.get("michael"));
        System.out.println(nickname.get("arthur"));

        

    }
}