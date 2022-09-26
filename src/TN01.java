import java.util.Scanner;

public class TN01 {
    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long F[] = new long[100];
        int t, i, n;
        F[0] = 0;
        F[1] = 1;
        for (i = 2; i <= 92; i++) F[i] = F[i - 1] + F[i - 2];
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            System.out.println(F[n]%mod);
        }
    }
}
