package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeQue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("Nguyen Van B");
        deque.offer("Nguyen Van A");
        deque.offerFirst("TITV1");
        deque.offerLast("TITV2");
        while(true){
            String show = deque.poll();
            if(show == null)  {
                break;
            }
            System.out.println(show);
        }
    }
}
