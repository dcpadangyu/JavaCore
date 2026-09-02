package QLSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DMY dmy = new DMY(14, 7, 2006);
        Lop lop = new Lop("DCT1245", "Cong Nghe Thong Tin");
        SV sv  = new  SV("3124410029", "Nguyen Dinh Chuong", 8.67, dmy, lop);
        sv.showNameKhoa();
        System.out.println();
        sv.checkSV();
        DMY dmy1 = new DMY(15, 9, 2006);
        Lop lop1 = new Lop("DCT1243", "Cong Nghe Thong Tin");
        SV sv1 = new SV("3124410023", "Nguyen Phuc Tai", 8.5, dmy1, lop1);
        sv.testDMYSV(sv1);

    }
}
