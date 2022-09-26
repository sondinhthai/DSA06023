import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DSA06025 {
    public static void main(String[] args) {
        int n;
        int[] a = new int[100];
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n;i++){
            a[i] = scanner.nextInt();
        }

        for (int i = 0;i<n;i++){
            list.add(a[i]);
            Collections.sort(list);
            System.out.print("Buoc " + (i) + ": ");
            for (int k = 0;k<list.size();k++){
                System.out.print(list.get(k) + " ");
            }
            System.out.println();
        }
    }
}
