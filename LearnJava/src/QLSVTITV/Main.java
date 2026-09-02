package QLSVTITV;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DAY day = new DAY();
        SV sv = new SV();
        FunctionSV fcSV = new FunctionSV();
        Scanner sc = new Scanner(System.in);
        int lc;
        do {
            sv.menu();
            System.out.println();
            System.out.print("Nhập lựa chọn của bạn:");
            lc = sc.nextInt();

            if(lc == 1) {
                System.out.print("Nhập số lượng sinh viên cần thêm: ");
                int n = sc.nextInt();
                sc.nextLine();

                for(int i = 0; i < n; i++) {
                    SV sv1 = new SV();

                    System.out.println("\n===== Nhập sinh viên thứ " + (i + 1) + " =====");
                    sv1.nhap(sc);

                    fcSV.addSV(sv1);
                }

                System.out.println("\nBạn đã thêm sinh viên thành công.");
                System.out.println("Nhấn Enter để quay lại menu...");
                sc.nextLine();
            }else if(lc == 2) {
                sc.nextLine();
                if(fcSV.checkSVisEmpty()) {
                        System.out.println("Danh sách rỗng!");
                }else {
                    System.out.println("Danh sách có sinh viên");
                   fcSV.xuat();
                }
                System.out.println("Bạn đã check thành công.");
                System.out.println("Nhấn Enter để quay lại menu...");
                sc.nextLine();
            }else if(lc == 3) {
                System.out.println("Số lượng sinh viên trong danh sách là: " + fcSV.getSLSV());
                System.out.println("Bạn đã xuất so lượng sinh viên thành công.");
                System.out.println("Nhấn Enter để quay lại menu...");
                sc.nextLine();
            }else if(lc == 4) {
                fcSV.clearSV();
                System.out.println("Bạn đã xoá sạch sinh viên thành công.");
                System.out.println("Nhấn Enter để quay lại menu...");
                sc.nextLine();
            }else if(lc == 5) {
                sc.nextLine();
                fcSV.searchSV(sc);
                System.out.println("Bạn đã tìm sinh viên thành công.");
                System.out.println("Nhấn Enter để quay lại menu...");
                sc.nextLine();
            }else if(lc == 6) {
                sc.nextLine();
                fcSV.removeSV(sc);
            }else if(lc == 7) {
                sc.nextLine();
                fcSV.PrintSVArrangePoints();
                System.out.println("Danh sách sinh viên có điểm từ thấp đến cao");
                fcSV.xuat();
                System.out.println("Bạn đã tìm sinh viên thành công.");
                System.out.println("Nhấn Enter để quay lại menu...");
                sc.nextLine();
            }


        }while(lc != 0);
System.out.println("Đã thoát chương trìnhhh!!!!");
    }
}
