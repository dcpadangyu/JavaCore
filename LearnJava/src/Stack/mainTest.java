package Stack;

import java.util.Scanner;
import java.util.Stack;

public class mainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stackStr = new Stack<>();
        // stack.push() => đưa giá trị vào stack
        // stack.pop() => lấy giá vaf xoá khỏi stack
        // stack.peek() => lấy giá trị và không xoá khỏi stack
        // stack.clear() => xoá tất ca phần từ trong stack
        // stack.contains() => xác định xem phần tử có tồn tại trong stack hay không
        // stack.size() => lấy ra độ lớn của stack
        // ví dụ đảo ngược chuỗi
        System.out.print("Nhập vào chuỗi");
        String s = sc.nextLine();
        // NDC ITSGU k24
        for(int i = 0; i < s.length(); i++){
            stackStr.push(s.charAt(i) + "");
            // bất cứ gì + cho chuỗi cũng thành chuỗi
        }
        System.out.println("Chuỗi đảo ngược");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackStr.pop());
        }
        // Chuyển từ hệ thập phân sang nhị phân
        System.out.println("Nhập số nguyên dương từ bàn phím");
        int d;
        do{
            d = sc.nextInt();
            if(d <= 0) {
                System.out.println("Vui lòng nhập lại!");
            }
        }while(d <= 0);
        Stack<Integer> stackInt = new Stack<>();
        while(d > 0) {
            int soDu = d % 2;
            d = d / 2;
            stackInt.push(soDu);
        }
        int n = stackInt.size();
        for(int i = 0; i < n; i++){
            System.out.print(stackInt.pop() + " ");
        }
    }
}
