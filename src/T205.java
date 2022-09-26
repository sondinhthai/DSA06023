import java.math.BigInteger;
import java.util.Scanner;

public class T205 {
    private static Scanner scanner = new Scanner(System.in);
    static int mod = 1000000007;

    public static void main(String[] args) {
        int t;
        t = scanner.nextInt();
        while (t --> 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(powerMod(n, k));
        }

    }

    public static long powerMod(int n, int k){
        if (k==0) return 1;
        long x = powerMod(n, k/2);
        if (k%2==0) return x*x%mod;
        return n*(x*x%mod)%mod;
    }
}
