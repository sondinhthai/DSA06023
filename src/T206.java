import java.util.Map;
import java.util.Scanner;

public class T206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(search(n,k));
        }
    }
    static int search (int n, long k){
        if (k == 1)
            return 1;
        if (k == Math.pow(2, n-1))
            return n;
        if (k < Math.pow(2, n-1))
            return search(n-1, k);
        return search(n-1, k - (long)Math.pow(2, n-1));
    }
}
