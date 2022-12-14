import java.util.Scanner;

public class TN01022 {
    static long m = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = 1, b = 1;
        while(a != 0 || b != 0){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 && b == 0)
                break;
            System.out.println(POW(a, b, m));
        }
    }

    public static long POW(long a, long b, long c) {
        if(b == 0)
            return 1;
        if (b == 1)
            return a;
        long x = POW(a,(long)b/2, c);
        if (b % 2 == 0)
            return (x % c * x % c) % c;
        return (x %c * x % c * a % c) % c;
    }
}
