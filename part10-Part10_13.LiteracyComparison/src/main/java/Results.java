public class Results{
    private String name;
    private int year;
    private String sex;
    private double literacyPercent;

    public Results( String name, int year, String sex, double literacyPercent ){
        this.name = name;
        this.year = year;
        this.sex = sex;
        this.literacyPercent = literacyPercent;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public String getSex(){
        return this.sex;
    }

    public double getLiteracyPercent(){
        return this.literacyPercent;
    }

}