import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t;
        t = scanner.nextInt();
        while (t --> 0){
            BigInteger a = scanner.nextBigInteger();

            BigInteger b = scanner.nextBigInteger();

            System.out.println((a.multiply(b)).divide(a.gcd(b)));
        }

    }
}
