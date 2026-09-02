package Function;

import java.util.Arrays;

public class function {
    public static int[] reverse(int[] x) {
        int[] rs = new int[x.length];
        int index = 0;
        for(int i = x.length - 1; i >= 0; i--){
            rs[index] = x[i];
            index++;
        }
        return rs;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 5, 10, 5, 6, 7, 12, 4};
        int[] b = new int[10];
        // sấp xeesp = hàm sort
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // hàm tìm kiếm
        System.out.println(Arrays.binarySearch(a, 5));
        System.out.println(Arrays.binarySearch(a, 10));
        System.out.println(Arrays.binarySearch(a, 13));
        // hàm điền giá trị
        Arrays.fill(b, 10);
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        a  = reverse(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 5));
        // phân tách chuỗi => split
        String s = "Nguyen dinh chuong, hoc tại SGU";
        String[] a1 = s.split(" ");
        System.out.println(Arrays.toString(a1));
        String[] b1 = s.split(",");
        System.out.println(Arrays.toString(b1));
        String s1 = "xin chào, Nguyen Dinh Chuong. hoc tại Dai hoc Sai Gon!";
        String [] b2 = s1.split("\\.|\\,");
        System.out.println(Arrays.toString(b2));
        System.out.println("Ten cua sinh vien la: " + b2[(b2.length - 1)/2]);
    }
}
