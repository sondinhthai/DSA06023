import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger a = scanner.nextBigInteger();

        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.subtract(b));

    }
}
