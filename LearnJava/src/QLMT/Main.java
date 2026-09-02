package QLMT;

public class Main {
    public static void main(String[] args) {
        HANGSX hangsx = new HANGSX("Dau say thang hoa");
        DMY dmy1 = new DMY(14, 7, 2006);
        QG qg1 = new QG("TDL", "Tam Dao");
        MT mt1 = new MT(hangsx, 134000, 12, dmy1, qg1);
        MT mt2 = new MT(hangsx, 135000, 12, dmy1, qg1);
        System.out.println(mt1.showTenQG());
        if(mt1.checkprice(mt2)) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
