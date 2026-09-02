package QLMT;


public class MT {
    private HANGSX hsx;
    private double giaBan;
    private  int tgBaoHanh; // theo thang
    private DMY dmy;
    private  QG qg;
    public MT(HANGSX hsx, double giaBan, int tgBaoHanh,  DMY dmy, QG qg) {
        this.hsx = hsx;
        this.giaBan = giaBan;
        this.tgBaoHanh = tgBaoHanh;
        this.dmy = dmy;
        this.qg = qg;
    }
    public boolean checkprice(MT mt_new) {
           return this.giaBan < mt_new.giaBan;
    }
    public String showTenQG() {
        return  qg.getTenQG();
    }
}
