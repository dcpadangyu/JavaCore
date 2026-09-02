package QLFILM;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            DMY dmy = new DMY(14, 8, 2026);
            Company cpn = new Company("ObamaNdc", "Mỹ" );
            Film film = new Film("Spiderman", 2026, 150000, dmy, cpn);
            film.ShowNameHFilm();
            System.out.println(film.toString());
            System.out.print("Nhập mã voucher để được giảm giá: ");
            double x = input.nextDouble();
            film.sale(x);
    }
}
