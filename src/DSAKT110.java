import java.util.Scanner;

public class DSAKT110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int a[]= new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            long b[]= new long[n];
            b[0] = (long) a[0];
            if(n>1)b[1] = (long) a[1];
            if(n>2)b[2] = Math.max((long)a[1], (long)a[0]+a[2]);
            for(int i=3;i<n;i++){
                long c = b[i-1];
                if(c<b[i-2]+a[i]){
                    c = b[i-2]+a[i];
                }
                if(c<b[i-3]+a[i]){
                    c = b[i-3]+a[i];
                }
                b[i]=c;
            }
            long rs = b[n-1];
            if(n>1) {
                rs = Math.max(rs, b[n-2]);
            }
            System.out.println( rs);
        }
    }
    public static String chuan(String s){
        String t ="";
        for(int i=0;i<s.length();i++){
            t +=""+Character.toLowerCase(s.charAt(i));
        }
        return t;
    }
}
