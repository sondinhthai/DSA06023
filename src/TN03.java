import java.util.Arrays;
import java.util.Scanner;

public class TN03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s;
        while (t-- > 0) {
            s = sc.next();
            System.out.println(in(s));
        }
    }

    static String in(String s) {
        char A[] = s.toCharArray();
        Arrays.sort(A);
        int tong = 0;
        String ketqua = "";
        for (int i = 0; i < A.length; i++) {
            if (Character.isDigit(A[i]))
                tong += Integer.parseInt(A[i] + "");
            else
                ketqua += A[i];
        }
        ketqua += tong;
        return ketqua;
    }
}
