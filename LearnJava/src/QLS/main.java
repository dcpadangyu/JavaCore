package QLS;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        qls ql = new qls("LearningJavaCoreMaster", 50000, 2006, "Nguyễn Đình Chương", 14, 07, 2006);
        System.out.print(ql.toString());
        Scanner sc=new Scanner(System.in);
        int nam_new=sc.nextInt();
        if(ql.searchNamSx(nam_new) == true){
            System.out.println("Có quyển sách xuất bản cùng năm với quyển tìm kíêm");
        }else {
            System.out.println("Not found");
        }
        double sale_new=sc.nextInt();
        ql.sale(sale_new);
    }
}
