import java.math.BigInteger;
import java.util.Scanner;

public class TN01010    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        BigInteger val;
        if (s.length() == 1) System.out.println(s);
        else {
            while (s.length() > 1) {
                BigInteger l, r;
                l = new BigInteger(s.substring(0, s.length() / 2));
                r = new BigInteger(s.substring(s.length() / 2));
                val = l.add(r);
                s = val.toString();
                System.out.println(val);
            }
        }
    }
}
