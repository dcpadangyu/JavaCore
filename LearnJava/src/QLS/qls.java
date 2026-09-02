package QLS;
import java.util.Scanner;

public class qls {
    String tenSach;
    double giaBan;
    int namSx;
    String tenTGia;
    int dayTG;
    int mothTG;
    int yearTG;
    public qls(){}
    public qls(String tenSach, double giaBan, int namSx, String tenTGia, int dayTG, int mothTG, int yearTG) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namSx = namSx;
        this.tenTGia = tenTGia;
        this.dayTG = dayTG;
        this.mothTG = mothTG;
        this.yearTG = yearTG;
    }

    public String toString(){
        return "Tên sách: " + this.tenSach +"\n" + "Giá bán: " + this.giaBan + "\n" + "Năm sx: " + this.namSx + "\n" + "Tên tgia: " + this.tenTGia + "\n" + "Ngày sinh: " + this.dayTG + "/" + this.mothTG + "/" + this.yearTG  ;
    }
    public boolean searchNamSx(int namSx_new) {
        if(namSx_new == (this.namSx)) {
            return true;
        }
        return false;
    }
    public void sale(double x) {
        double rs = this.giaBan * (1 - x/100);
        System.out.println("Giá sách sau khi sale x% là: " + rs);
    }
}
