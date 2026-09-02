package DateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.sql.Date;
public class functionDateTime {
    public static void main(String[] args) {
            // System.currentTimeMillis() => hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for(int i = 0; i < 10; i++) {
            System.out.println("TEST");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Trước khi chạy for: " + t1);
        System.out.println("Sau khi chạy for: " + t2);
        System.out.println("Thời gian: " + ((t2 - t1)) + "mls");
        System.out.println("Thời gian " + ((t2 - t1))/1000 + "s");
        // Date
        Date date = new Date(System.currentTimeMillis());
        //  month: 0 - 11
        System.out.println(date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900));
        // Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DATE) + " - " + (calendar.get(Calendar.MONTH) + 1 ) + " - " + calendar.get(Calendar.YEAR)) ;
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(date));
        df =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(date));
    }
}
