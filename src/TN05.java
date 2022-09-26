import java.util.Scanner;

public class TN05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

    static String chuanHoa(String s) {
        String ketQua = "";
        String k = s.trim();
        String s1[] = k.split("\\s+");
        for (int i = 0; i < s1.length; i++) {
            ketQua += String.valueOf(s1[i].charAt(0)).toUpperCase() + s1[i].substring(1).toLowerCase();
            if (i < s1.length - 1) {
                ketQua += " ";
            }
        }
        return ketQua;
    }
}
