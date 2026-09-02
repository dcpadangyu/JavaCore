package QLFILM;

public class Film {
    String nameFilm;
    int YearProduce;
    double PriceTicket;
    DMY dmy;
    Company cpn;
    public Film(){}
    public  Film(String name, int YearProduce, double PriceTicket, DMY dmy, Company cpn) {
        this.nameFilm = name;
        this.YearProduce = YearProduce;
        this.PriceTicket = PriceTicket;
        this.dmy = dmy;
        this.cpn = cpn;
    }
    public String toString(){
        return nameFilm + " " + YearProduce + " " + PriceTicket + " " + dmy.toString() + " "  + cpn.toString();
    }
    public boolean checkTicketsPrice(double PriceTicket_check){
            if(PriceTicket_check>this.PriceTicket){
                return true;
            }
            return false;
    }
    public void ShowNameHFilm() {
        System.out.println("Name: " + cpn.Name);
    }
    public void sale(double x) {
        double rs = this.PriceTicket * (1 - x/100);
        System.out.println("Giá vé xem phim sau khi áp voucher " + x + "% là: " + rs + "VNĐ");
    }
}
