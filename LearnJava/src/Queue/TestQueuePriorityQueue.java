package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueuePriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<String>();
        queue.offer("TITV1");
        queue.offer("NGUYEN VAN B");
        queue.offer("NGUYEN VAN A");
        queue.offer("TITV2");
        while (true) {
            String ten = queue.poll();
            if(ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
