package QLCS;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCSMAIN {
    public static void main(String[] args) {
        ArrayList<CSI> dscsi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        CSI CSi = null;
        for(int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin ca sĩ mà bạn muốn.");
            System.out.println("Chon ca sĩ muốn nhập[1,(Ca sĩ nổi tiếng), 2.(Ca sĩ chưa nỗi tiếng)");

            int luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon) {
                case 1:
                    CSi = new CSINT();
                    System.out.println("Nhập thông tin ca sĩ nổi tiếng");
                    break;
                    case 2:
                        CSi = new CSICNT();
                        System.out.println("Nhập thông tin ca sĩ nổi tiếng");
                        break;
                        default:
                            System.out.println("Nhập thông tin không hợp lệ!");
                            i--;
                            break;
            }
            if (CSi != null) {
                CSi.nhap();
                dscsi.add(CSi);
            }
            //xuất danh sách
            System.out.println("-------------------------------");
            System.out.println("Danh sách ca sĩ đã nhập");
            for(CSI csishow : dscsi) {
                csishow.xuat();
                System.out.println("Lương " + csishow.tinhLuong());
                System.out.println("--------------------------------");
            }
        }
    }
}
