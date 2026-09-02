package MiniGameTaiXiu;

import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {

        double taiKhoanUser = 5000;

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int lc = 1;

        do {
            System.out.println("\n------------ MỜI BẠN LỰA CHỌN ----------------");
            System.out.println("Chọn [1] để bắt đầu chơi!!!!");
            System.out.println("Chọn [0] để thoát.");
            System.out.print("Nhập lựa chọn: ");

            lc = sc.nextInt();

            if (lc == 1) {

                // Kiểm tra tài khoản
                if (taiKhoanUser <= 0) {
                    System.out.println("Bạn đã hết tiền!");
                    System.out.println("Không thể tiếp tục chơi.");
                    break;
                }

                System.out.println("\n---------- BẮT ĐẦU CHƠI THÔI NÀO !!!! ----------");
                System.out.println("Tài khoản của bạn hiện có: " + taiKhoanUser + " VND");

                // Nhập tiền cược
                double datCuoc;

                do {
                    System.out.print("Vui lòng đặt cược số tiền lớn hơn 0 và nhỏ hơn hoặc bằng "
                            + taiKhoanUser + ": ");

                    datCuoc = sc.nextDouble();

                } while (datCuoc <= 0 || datCuoc > taiKhoanUser);

                // Người chơi chọn Tài / Xỉu
                int luaChonTaiXiu;

                do {
                    System.out.println("\n(1). Tài");
                    System.out.println("(2). Xỉu");
                    System.out.print("Mời bạn nhập lựa chọn: ");

                    luaChonTaiXiu = sc.nextInt();

                } while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);

                // Tung 3 viên xúc xắc
                int gt1 = rd.nextInt(6) + 1;
                int gt2 = rd.nextInt(6) + 1;
                int gt3 = rd.nextInt(6) + 1;

                int kq = gt1 + gt2 + gt3;

                System.out.println("\n========== KẾT QUẢ ==========");
                System.out.println("Xúc xắc 1: " + gt1);
                System.out.println("Xúc xắc 2: " + gt2);
                System.out.println("Xúc xắc 3: " + gt3);
                System.out.println("Tổng điểm: " + kq);

                // =========================
                // LOGIC GAME
                // =========================

                // Trường hợp 3 hoặc 18
                if (kq == 3 || kq == 18) {

                    System.out.println("Nhà cái ăn hết!");
                    System.out.println("Bạn đã THUA cược: " + datCuoc + " VND");

                    taiKhoanUser = taiKhoanUser - datCuoc;
                }

                // Trường hợp XỈU
                else if (kq >= 4 && kq <= 10) {

                    System.out.println("Kết quả: XỈU");

                    if (luaChonTaiXiu == 2) {

                        System.out.println("Bạn chọn XỈU.");
                        System.out.println("🎉 Bạn đã THẮNG!");

                        taiKhoanUser = taiKhoanUser + datCuoc;

                    } else {

                        System.out.println("Bạn chọn TÀI.");
                        System.out.println("Bạn đã THUA!");

                        taiKhoanUser = taiKhoanUser - datCuoc;
                    }
                }

                // Trường hợp TÀI
                else if (kq >= 11 && kq <= 17) {

                    System.out.println("Kết quả: TÀI");

                    if (luaChonTaiXiu == 1) {

                        System.out.println("Bạn chọn TÀI.");
                        System.out.println(" Bạn đã THẮNG!");

                        taiKhoanUser = taiKhoanUser + datCuoc;

                    } else {

                        System.out.println("Bạn chọn XỈU.");
                        System.out.println("Bạn đã THUA!");

                        taiKhoanUser = taiKhoanUser - datCuoc;
                    }
                }

                System.out.println("--------------------------------");
                System.out.println("Số dư tài khoản: " + taiKhoanUser + " VND");
            }

            else if (lc == 0) {
                System.out.println("Cảm ơn bạn đã chơi!");
            }

            else {
                System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (lc != 0);

        sc.close();
    }
}