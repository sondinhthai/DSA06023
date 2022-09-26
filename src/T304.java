import java.util.Scanner;

public class T304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int l[] = new int[n];
        int max = 0;
        l[0] = 1;
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            l[0] = 1;
            for (int j = 0; j < i; j++){
                if (a[j] < a[i])
                    l[i]= Math.max(l[i], l[j]+1);
            }
            max = Math.max(max, l[i]);
        }
        System.out.println(max);
    }
}
