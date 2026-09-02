package QLFILM;

public class Company {
    String Name;
    String Country;
    public Company(String Name, String Country) {
        this.Name = Name;
        this.Country = Country;
    }
    public String toString(){
        return Name +  " " + Country;
    }
}
