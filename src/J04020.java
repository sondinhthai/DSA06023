import java.util.Scanner;

public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}

class Pair<T1, T2>{
    private T1 f1;
    private T2 f2;

    public Pair(T1 f1, T2 f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    public boolean isPrime(){
        if (f1 instanceof Integer ){
            if (f2 instanceof Integer ){
                return checkPrime((Integer)f1)&&checkPrime((Integer) f2);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return  f1 + " " + f2;
    }
    public static boolean checkPrime(Integer n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
