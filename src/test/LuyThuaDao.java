package test;

import java.util.Scanner;

public class LuyThuaDao {
    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long n = scanner.nextLong();
            long k = 0;
            long m = n;
            while(m>0){
                k = 10*k+m%10;
                m = m / 10;
            }
            System.out.println(powerMod(n,k));
        }
    }
    public static long powerMod(long n, long k){
        if(k == 1) return n % mod;
        long x = powerMod(n,k/2);
        if(k % 2 == 0) return x*x%mod;
        return n*(x*x%mod)%mod;
    }
}
