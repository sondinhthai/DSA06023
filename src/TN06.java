import java.util.Scanner;
import java.util.StringTokenizer;

public class TN06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i, k;
        String ds[] = new String[t];
        int dem[] = new int[t];
        sc.nextLine();
        for (i = 0; i < t; i++) {
            String s = sc.nextLine();
            ds[i] = email(s);
        }
        for (i = 0; i < t; i++) {
            if (dem[i] == 0) {
                k = 1;
                for (int j = i; j < t; j++) {
                    if (ds[j].equals(ds[i]))
                        dem[j] = k++;
                }
            }
        }
        for (i = 0; i < t; i++) {
            if (dem[i] == 1)
                ds[i] += "@ptit.edu.vn";
            else
                ds[i] += dem[i] + "@ptit.edu.vn";
            System.out.println(ds[i]);
        }
    }

    static String email(String s) {
        String ketQua = "";
        String k = s.trim();
        String s1[] = k.split("\\s+");
        ketQua = s1[s1.length - 1];
        for (int i = 0; i < s1.length - 1; i++) {
            ketQua += s1[i].charAt(0);
        }
        return ketQua.toLowerCase();
    }
}
