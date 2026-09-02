package STRING;

import java.util.Scanner;

public class StringMain {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
//         String s = input.nextLine();
//         System.out.println("-------------------");
//         System.out.println(s.length());
//         System.out.print("Nhập vị trí kí tu cần lấy ra: ");
//         int choose =  input.nextInt();
//         System.out.println(s.charAt(choose));
//         char[] arrayChar = new char[5];
//         s.getChars(10, 14, arrayChar, 0);
//         for (int i = 0; i < arrayChar.length; i++) {
//             System.out.print( arrayChar[i]);
//         }
         String s1 = "ndcd";
         String s2 = "ndcde";
         String s3 = "ndc";
         String s4 = "ndc";
         // hàm equals so sánh 2 chuỗi có phân bieetj hoa thường
         System.out.println(s1.equals(s2));
         // hàm equalsIgnoreCase so sánh 2 chuỗi không phân biệt hoa thường
         System.out.println(s1.equalsIgnoreCase(s3));
         System.out.println(s1.equalsIgnoreCase(s2));
         // hàm compareTo [<0]: s1<s2, [0]: s1 = s2, [>0]: s1 > s2
         System.out.println(s1.compareTo(s2));
         System.out.println(s1.compareTo(s3));
         System.out.println(s3.compareTo(s4));
         // hàm compareToIgnoreCase tương tự compareTo nhưng không phân biệt chữ hoa thường
         // hàm startsWith => kiểm tra chuối bắt đầu bằng...
         String sdt1 = "0354109892";
         System.out.println(sdt1.startsWith("041"));
         // hàm endsWith => kiêm tra chuỗi kết thức bằng ...
         String nameFile1 = "Linhwaxink.JPG";
         String nameFile2 = "JavaCoreMaster.PDF";
         if(nameFile1.endsWith("JPG")){
             System.out.println(nameFile1);
         }else {
             System.out.println("Không phải file JPG");
         }

         // hàm indexOf
         String s5 = "Nguyễn Đình Chương learning javacoremaster learning TITTV";
         String s6 = "learning";
         String s7 = "TIT";
         char c1 = 'j';
         System.out.println(s5.indexOf(s6));
         // tìm kiếm với vị trí bắt đầu
         System.out.println(s5.indexOf(s6, 35));
         System.out.println(s5.indexOf(s7, 40));
         // tìm kiếm char
         System.out.println(s5.indexOf(c1));
         // lastIndexOf tìm kiém từ phải sang trái
         System.out.println(s5.lastIndexOf(s6));
         // hàm concat dùng để nối chuỗi lại với nhau
         String s8 = "Nguyendinhchuong";
         String s9 = "@gmail.com";
         System.out.println(s8.concat(s9));
         // hàm replace => thay thế
         String s10 = "Ndc.vn";
         String s11 = s10.replaceAll(".vn", "@gmail.com");
         String s12 = s11.toUpperCase();
         String s13 = s11.toLowerCase();
         System.out.println(s11);
         System.out.println(s12);
         System.out.println(s13);
         // trim() => xoá các khoảng trắng dư thừa ở đầu chuỗi
         String s14 = "       Nguyễn Đình Chương kkkk      ";
         System.out.println(s14.trim());
         // substring() => cắt chuỗi từ vị trí bắt đầu
         String s15 = s11.substring(4);
         String s16 = s11.substring(0, 4);
         System.out.println(s15);
         System.out.println(s16);

      }
}
