import java.util.Scanner;
import java.util.Stack;

public class DSA07019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0){
            int n = scanner.nextInt();
            int a[] = new int[n];

            for (int i=0;i<n;i++){
                a[i] = scanner.nextInt();
            }
            xuly(a, n);
        }
    }

    public static void xuly(int a[], int n){
        int R[] = new int[n], i, j;
        Stack<Integer> stack = new Stack<>();
        for (i=n-1;i>=0;i--){
            while (!stack.empty() && a[i] >= stack.peek()) stack.pop();
            if (stack.empty()) R[i] = -1;
            else R[i] = stack.peek();
            stack.push(a[i]);
        }

        for (i=0;i<n;i++){
            System.out.println(R[i] + " ");
        }

        System.out.println();
    }
}
