import java.util.Scanner;
import java.util.Stack;

public class S213 {
    private static void tinh(Stack<Long> st, int n) {
        st.push((long) 6);
        st.push((long) 8);
        for(int i = 1; i < n; i++) {
            int size = st.size();
            for(int j = (int) Math.pow(2, i) - 2; j < size; j++) {
                st.push(st.elementAt(j) * 10 + 6);
                st.push(st.elementAt(j) * 10 + 8);
            }
        }
        System.out.println(st.size());
        while(!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            Stack<Long> st = new Stack<>();
            tinh(st, n);
        }
    }
}
