package QLSV;

public class DMY {
    int ngay, thang, nam;
    public DMY(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}
