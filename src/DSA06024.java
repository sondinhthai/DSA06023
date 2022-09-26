import java.util.Scanner;

public class DSA06024 {
    public static void main(String[] args) {
        int n;
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;

            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;

            System.out.print("Buoc " + (i+1) + ": ");
            for (int k = 0;k<n;k++){

                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
