package test;

import java.util.Scanner;
import java.util.TreeSet;

public class DungDau {
    private static int n;
    private static int[] a = new int[10];
    private static String[] name = new String[10];
    private static TreeSet<String> name1;
    private static String s;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        name1 = new TreeSet<>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            name1.add(name[i]);
        }
        s = sc.next();
        name1.remove(s);
        name = new String[10];
        int res = name1.size();
        for (int i = 1; i<= res; i++){
            name[i] = name1.first();
            name1.remove(name1.first());
            a[i] = i;
        }
        n = res;
        sinhHoanVi();

    }
    public static void Result() {
        System.out.print(s+" ");
        for (int j = 1; j <= n; j++)
            System.out.print(name[a[j]] + "  ");
        System.out.println();

    }

    public static void sinhHoanVi() {
        int i;
        do {
            Result();
            i = n - 1;
            while (i > 0 && a[i] > a[i+1]) --i;
            if (i > 0) {
                int k = n;
                while (a[k] < a[i]) --k;
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;

                k = n;
                for (int j = i + 1; j < k ; j++, k--) {
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                }
            }
        } while (i != 0);
    }
}
