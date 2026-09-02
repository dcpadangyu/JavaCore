package QLCS;

public class CSICNT extends CSI{
    public CSICNT(String hoTen, int soNam, int soDia) {
        super(hoTen,soNam,soDia);
    }
    public CSICNT() {
        super();
    }
    @Override
    public double tinhLuong() {
        double luong = 1000000 + 500000 * getSoNam() + 1000 * getSoDia();
        return luong;
    }
    public  void nhap() {
        super.nhap();
    }
}
