import java.util.ArrayList;
import java.util.Scanner;

public class TN01021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t>0){
            t--;
            int n  = sc.nextInt();
            int k  = sc.nextInt();
            ArrayList<Long> a = new ArrayList<>();
            a.add((long)1);
            for(int i=1;i<k;i++){
                long c =1;
                for(int j=0;j<i;j++){
                    c=(c+a.get(j))%1000000007;
                }
                a.add(c);
            }

            for(int i=k;i<n;i++){
                long c =0;
                for(int j=0;j<k;j++){
                    c=(c+a.get(i-1-j))%1000000007;
                }
                a.add(c);
            }
            System.out.println(a.get(n-1));
        }

    }
}
