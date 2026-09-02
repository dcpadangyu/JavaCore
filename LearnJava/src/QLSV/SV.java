package QLSV;

public class SV {
    String msSV;
    String hoTen;
    DMY dmy;
    double avg;
    Lop lop;
    public SV(String msSV, String hoTen, double avg, DMY dmy, Lop lop) {
        this.msSV = msSV;
        this.hoTen = hoTen;
        this.dmy = dmy;
        this.avg = avg;
        this.lop = lop;
    }
    public void showNameKhoa(){
        System.out.print("Ten khoa sinh vien " + this.hoTen + " dang hoc la " + lop.tenKhoa);
    }
    public void checkSV() {
        if(this.avg <= 5.0) {
            System.out.println("Sinh vien rot!");
        }else {
            System.out.println("Sinh vien dau");
        }
    }
    public void testDMYSV(SV SVkhac) {
        if(SVkhac.dmy.ngay == this.dmy.ngay) {
            System.out.println("Sinh vien co cung ngay sinh");
        }else {
            System.out.println("Sinh vien khac ngay sinh!");
        }
    }

}
