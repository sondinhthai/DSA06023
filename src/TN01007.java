import java.math.BigInteger;
import java.util.Scanner;

public class TN01007 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t;
        t = scanner.nextInt();
        while (t-->0){
            BigInteger a = scanner.nextBigInteger();

            BigInteger b = scanner.nextBigInteger();

            BigInteger s1 = a.mod(b);
            BigInteger s2 = b.mod(a);
            if (s1.compareTo(BigInteger.valueOf(0)) == 0 || s2.compareTo(BigInteger.valueOf(0)) == 0 ){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
