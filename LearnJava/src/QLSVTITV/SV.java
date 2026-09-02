package QLSVTITV;

import java.util.Scanner;

public class SV {
        private  String maSV;
        private String hoTen;
        private double diemTB;
        private  DAY namSinh;
        public SV() {
            maSV = "";
            hoTen = "";
            diemTB = 0;
            namSinh = null;
        }
        public SV(String maSV, String hoTen, double diemTB,  DAY namSinh) {
                this.maSV = maSV;
                this.hoTen = hoTen;
                this.diemTB = diemTB;
                this.namSinh = namSinh;
        }
        public String getMaSV() {
            return maSV;
        }
        public void setMaSV(String maSV) {
            this.maSV = maSV;
        }
        public String getHoTen() {
            return hoTen;
        }
        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }
        public double getDiemTB() {
            return diemTB;
        }
        public void setDiemTB(double diemTB) {
            this.diemTB = diemTB;
        }
    public void nhap(Scanner sc) {
        System.out.print("Nhập mã sinh viên:");
        maSV = sc.nextLine();

        System.out.println("Nhập họ tên sinh viên:");
        hoTen = sc.nextLine();

        System.out.println("Nhập điểm trung bình:");
        diemTB = sc.nextDouble();

        namSinh = new DAY();
        namSinh.nhap(sc);
        sc.nextLine();
    }
        public String toString() {
            return this.maSV + " -  " +  this.hoTen + " -  " + this.diemTB + " -  " + this.namSinh.toString();
        }
        public void menu() {
            System.out.println("-------------Menu quản lý sinh viên----------------");
            System.out.println("1.Thêm sinh viên vào danh sách");
            System.out.println("2.Kiểm tra danh sách có rỗng hay không");
            System.out.println("3.Lấy ra số lượng sinh viên trong danh sách");
            System.out.println("4. Làm rỗng danh sách sinh viên");
            System.out.println("5. Kiểm tra sinh viên có tồn tại trong danh sách sinh viên thông qua mã sinh viên");
            System.out.println("6. Xoá sinh viên khỏi danh sách");
            System.out.println("7.Tìm kiếm sinh viên dựa trên tên của sinh viên đó");
            System.out.println("8.Xuất danh sách sinh viên có điểm từ thấp đến cao");
            System.out.println("0. Thoát khỏi lựa chọn!");
        }
}
