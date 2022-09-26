import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[100];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                list1.add(a[i]);
            }

            for (int i = n - 1; i >= 0; i--) {
                list2.add(a[i]);
            }

            if (list1.equals(list2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
