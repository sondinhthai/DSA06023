import java.util.Scanner;

public class TN02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        long n;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextLong();
            System.out.println(UNTLN(n));
        }
    }

    static Boolean nguyenTo(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static long UNTLN(long n) {
        long max = 2;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (nguyenTo(i) == true && i > max) {
                    max = i;
                }
                if (nguyenTo(n / i) == true && (n / i) > max) {
                    max = n / i;
                }
            }
        }
        return max;
    }
}
