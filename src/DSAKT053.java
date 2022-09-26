import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeSet;

public class DSAKT053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();

        while (t-->0){
            BigInteger n = scanner.nextBigInteger();
            BigInteger m = scanner.nextBigInteger();
            TreeSet<String> a = new TreeSet<>();
            TreeSet<String> b = new TreeSet<>();

            String s1 = n.toString();
            String s2 = m.toString();

            for (int i = 0;i<s1.length();i++){
                a.add(String.valueOf(s1.charAt(i)));
            }

            for (int i = 0; i< s2.length();i++){
                b.add(String.valueOf(s2.charAt(i)));
            }

            a.retainAll(b);

            for (String i : a){
                System.out.println(i);
            }
        }
    }
}
