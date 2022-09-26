import java.util.Scanner;

public class T301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            s1 = " " +s1;
            String s2 = sc.nextLine();
            s2 = " " +s2;
            char a[] = s1.toCharArray();
            char b[] = s2.toCharArray();
            int F[][] = new int [1005][1005];
            for (int i = 1; i < a.length; i++){
                for (int j = 1; j < b.length; j++){
                    if (a[i] == b[j])
                        F[i][j] = F[i-1][j-1] + 1;
                    else
                        F[i][j] = Math.max(F[i][j-1], F[i-1][j]);
                }
            }
            System.out.println(F[a.length-1][b.length-1]);
        }
    }
}
