import java.util.*;

public class J04003 {
    private long Tu,Mau;

    public J04003(long Tu, long Mau) {
        this.Tu = Tu;
        this.Mau = Mau;
    }
    public J04003 toiGian(){
        long g= gcd(this.Tu,this.Mau);
        return new J04003(Tu/g, Mau/g);
    }
    @Override
    public String toString() {
        return Tu + "/" + Mau;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(new J04003(sc.nextLong(),sc.nextLong()).toiGian());

    }
    public static long gcd(long a,long b){
        while(b!=0){
            long t =b;
            b = a%b;
            a=t;
        }
        return a;
    }
}
