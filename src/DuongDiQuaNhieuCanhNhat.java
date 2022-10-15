import java.util.Scanner;

public class DuongDiQuaNhieuCanhNhat {
    static int max;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            max = 0;
            n = sc.nextInt();
            int e = sc.nextInt();
            int a[][] = new int[n + 1][n + 1];
            for (int i = 0; i < e; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                a[u][v] = 1;
                a[v][u] = 1;
            }
            for (int i = 0; i < n; i++) {
                DFS(a, i, 0);
            }
            System.out.println(max);
        }
    }

    public static void DFS(int[][] a, int k, int len) {
        if (len > max) {
            max = len;
        }
        for (int i = 0; i < n; i++) {
            if (a[k][i] == 1) {
                a[k][i] = 0;
                a[i][k] = 0;
                DFS(a, i, len + 1);
                a[k][i] = 1;
                a[i][k] = 1;
            }
        }

    }
}
