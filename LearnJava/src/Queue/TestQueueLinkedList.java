package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueLinkedList {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();
        // offer => truyền giá trị vào Queue
        danhSachSV.offer("TITV1");
        danhSachSV.offer("NGUYEN VAN B");
        danhSachSV.offer("NGUYEN VAN A");
        danhSachSV.offer("TITV2");
        while(true) {
            // poll => lấy giá trị từ queue và xoá
            String ten =  danhSachSV.poll();
            if(ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
