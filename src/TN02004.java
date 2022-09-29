import java.util.Scanner;

public class TN02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}

class Matrix{
    private int m1, m2;
    private int[][] arr;

    public Matrix(int m1, int m2) {
        this.m1 = m1;
        this.m2 = m2;
        arr = new int[m1][m2];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix mt2) {
        Matrix mtTich = new Matrix(m1, mt2.m2);
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < mt2.m2; j++) {
                mtTich.arr[i][j] = 0;
                for (int k = 0; k < m2; k++) {
                    mtTich.arr[i][j] += arr[i][k] * mt2.arr[k][j];
                }
            }
        }
        return mtTich;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.m1; i++) {
            for (int j = 0; j < this.m2; j++) {
                str += arr[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
}