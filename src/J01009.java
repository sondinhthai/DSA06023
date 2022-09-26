import java.util.Scanner;

public class J01009 {
    public static long tinhGiaiThua(int n) {
        long gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long S = 0;
        for (int i = 1; i <= n; i++) {
            S += tinhGiaiThua(i);
        }
        System.out.println(S);
    }
}
