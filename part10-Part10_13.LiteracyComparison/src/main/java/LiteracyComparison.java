
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    /*My solution does not use Results class
    public static void main(String[] args) {
        //List<String> data = new ArrayList<>();
        try{
            Files.lines( Paths.get("literacy.csv") ) //stream ../../../literacy.csv
            .map( row -> row.split(",") )
            .sorted( (row1, row2) -> {
                return row1[5].compareTo(row2[5]);
            })
            .map( row -> {
                String gender = row[2].trim().split(" ")[0]; //2 gender
                return row[3].trim() + " (" + row[4] +"), " + gender + ", " + row[5];

            })
            //.limit(10)
            .forEach( row -> System.out.println(row));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
     */
    public static void main(String args[]){
        ArrayList<Results> rows = new ArrayList<>();
        try{
            Files.lines( Paths.get("literacy.csv")) // stream
                .map(  data -> data.split(","))
                .forEach( data -> {
                    String gender = data[2].replace("(%)","").trim();
                    rows.add(new Results( data[3], Integer.valueOf(data[4]), gender, Double.parseDouble(data[5]) ));
                });
        }catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }
        //.map( data -> rows.add( data ));
        rows.stream()
            .sorted( (row1, row2 ) -> {
                if( row1.getLiteracyPercent() < row2.getLiteracyPercent()){
                    return -1;
                }else if( row1.getLiteracyPercent() > row2.getLiteracyPercent() ){
                    return 1;
                }else{
                    return 0;
                }
            })
            .forEach( data -> System.out.println( data.getName() + " (" + data.getYear() + "), " + data.getSex() +", " + data.getLiteracyPercent() ));

    }
}
