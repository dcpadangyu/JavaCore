package QLCS;

import java.util.Scanner;

abstract class CSI {
    protected   String hoTen;
    protected int soNam;
    protected int soDia;
    public CSI() {}
    public CSI(String hoTen, int soNam, int soDia) {
        this.hoTen = hoTen;
        this.soNam = soNam;
        this.soDia = soDia;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getSoNam() {
        return soNam;
    }
    public void setSoNam(int soNam) {
        this.soNam = soNam;
    }
    public int getSoDia() {
        return soDia;
    }
    public void setSoDia(int soDia) {
        this.soDia = soDia;
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên ca sĩ: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhập số năm làm việc: ");
        this.soNam = scanner.nextInt();
        System.out.print("Nhập số đĩa đã bán được: ");
        this.soDia = scanner.nextInt();
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Số năm làm việc: " + soNam);
        System.out.println("Số đĩa bán được: " + soDia);
    }

    public abstract double tinhLuong();
}

