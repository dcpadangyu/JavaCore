package QLSVTITV;

import java.util.Scanner;

public class DAY extends SV {
    private int ngay, thang, nam;
    public DAY() {
        ngay = 0;
        thang = 0;
        nam = 0;
    }
    public DAY(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    @Override
    public void nhap(Scanner sc) {
        System.out.println("Nhập ngày tháng năm: ");
        ngay = sc.nextInt();
        thang = sc.nextInt();
        nam = sc.nextInt();
    }
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}
