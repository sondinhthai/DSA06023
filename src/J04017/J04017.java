package J04017;

import java.util.Scanner;

public class J04017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            Matrix a = new Matrix(n, m);
            a.nextMatrix(sc);
            Matrix b = a.trans();
            System.out.println(a.mul(b));
        }
    }
}

class Matrix {
    private int a[][];

    public Matrix(int m, int n) {
        a = new int[m][n];
    }

    public Matrix(int[][] a) {
        this.a = a;
    }

    public Matrix mul(Matrix o) {
        int m = this.a.length, n = this.a[0].length, k = o.a[0].length;
        int res[][] = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                int e = 0;
                for (int i1 = 0; i1 < n; i1++) {
                    e += a[i][i1] * o.a[i1][j];
                }
                res[i][j] = e;
            }
        }
        return new Matrix(res);
    }

    public Matrix trans() {
        int b[][] = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        return new Matrix(b);
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }

        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < a.length; i++) {
            String row = "";
            for (int j = 0; j < a[i].length; j++) {
                row += a[i][j] + " ";
            }
            res += row.trim() + "\n";
        }
        return res.trim();
    }
}