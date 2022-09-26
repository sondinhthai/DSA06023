import java.util.Scanner;

public class TN04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean check(String s) {
        StringBuilder s1 = new StringBuilder(s);
        String s2 = new String(s1.reverse());
        if (!s.equals(s2)) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            int k = Integer.parseInt(s.charAt(i) + "");
            if (k % 2 != 0)
                return false;
        }
        return true;
    }
}
