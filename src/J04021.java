import java.util.Scanner;
import java.util.TreeSet;

public class J04021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
class IntSet {
    private TreeSet<Integer> set = new TreeSet<>();

    public IntSet() {
    }

    public IntSet(int a[]) {
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
    }

    @Override
    public String toString() {
        String kq = "";
        for(Integer i : set){
            kq = kq + i + " ";
        }
        return kq;
    }

    public IntSet union(IntSet a){
        IntSet u = new IntSet();
        u.set.addAll(set);
        u.set.addAll(a.set);
        return u;
    }

}