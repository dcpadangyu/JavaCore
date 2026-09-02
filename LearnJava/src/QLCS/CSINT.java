package QLCS;

import java.util.Scanner;

class CSINT  extends CSI {
    private  int soGameShow;
    public CSINT(String hoTen, int soNam, int soDia, int soGameShow) {
        super(hoTen, soNam, soDia);
        this.soGameShow = soGameShow;
    }
    public CSINT() {
        super();
        soGameShow = 0;
    }
    @Override
    public double tinhLuong() {
        double luong = 5000000 + 500000 * getSoNam()  + 1200 * getSoDia() + 500000 * soGameShow;
        return luong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhập so gameshow");
        soGameShow = sc.nextInt();
    }
}
