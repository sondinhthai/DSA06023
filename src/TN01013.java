import java.util.Scanner;

public class TN01013 {
    static long f[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char d = s.charAt(0);
        int n = sc.nextInt();
        char []c = new char[n];
        solve(c,n,0,0,d-'A'+1);
    }
    static void solve( char []c,int n,int k,int mini,int l){
        if (k==n){
            System.out.println(String.valueOf(c));
            return;
        }
        for(int i=mini;i<l;i++){
            c[k]= (char)('A'+i);
            solve(c,n,k+1,i,l);
        }
    }
}
