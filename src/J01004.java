import java.util.Scanner;

public class J01004 {
    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while (t-->0){
            long n = scanner.nextLong();
            if (snt(n)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
        }
    }
}

    private static boolean snt(long n) {
        if (n<2) return false;
        for (int i = 2;i*i<=n;i++){
            if (n%i==0) return false;
        }
        return true;
    }
    }
