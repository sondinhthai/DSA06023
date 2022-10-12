import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThanhThanLienThong2 {
    static List<Integer>[] list = (List<Integer>[]) new List[500000];
    static long[] check = new long[500000];
    //abcdef
    static void DFS(int u) {
        check[u] = 1;
        for (int i = 0; i < list[u].size(); i++) {
            int v = list[u].get(i);
            if (check[v] == 0) DFS(v);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        check = new long[500000];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        long a = sc.nextLong();
        long b = sc.nextLong();
        for (int i = 1; i <= b; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            list[u].add(v);
            list[v].add(u);
        }
        for (int k = 1; k <= a; k++){
            for(int i = 1; i <= a; i++){
                check[i] = 0;
            }
            int res = 0;
            check[k] = 1;
            for (int i = 1; i <= a; i++) {
                if (check[i] == 0) {
                    res++;
                    DFS(i);
                }
            }
            System.out.println(res);
        }
    }
}
