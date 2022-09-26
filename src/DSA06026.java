import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DSA06026 {
    public static void main(String[] args) {
        int n;
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.print("Buoc " + i + ": ");
            for (int k = 0; k < n; k++) {

                System.out.print(a[k] + " ");
            }
            System.out.println();
        }

    }
}
