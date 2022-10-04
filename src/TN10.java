import java.util.Arrays;
import java.util.Scanner;
//asdasd
public class TN10 {
    static String str;
    static int n;
    static int[] a = new int[100];
    static boolean check[] = new boolean[100];
    static void solve(int i){
        for (int j = n; j >=1 ; j--) {
            if(!check[j]){
                a[i] = j;
                check[j] = true;
                if(i == 1){
                    for (int k = n; k >=1 ; k--) {
                        System.out.print(a[k]);
                    }
                    System.out.print(" ");
                }
                else solve(i - 1);
                check[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            for (int i = 1; i<=n; i++){
                a[i]= i;
            }
            solve(n);
            System.out.println();
        }
    }
}
