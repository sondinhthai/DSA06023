import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LietKeDinhTru {
    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static boolean[] check = new boolean[1005];
    static int[] before = new int[1005];

    static void DFS(int u) {
        check[u] = true;
        for (int i = 0; i < list[u].size(); i++) {
            int v = list[u].get(i);
            if (!check[v]) {
                before[v] = u;
                DFS(v);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            check = new boolean[1005];
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int i = 0; i < b; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list[u].add(v);
                list[v].add(u);
            }
            int res = 0;
            for (int i = 1; i <= a; i++) {
                if (check[i] == false) {
                    res++;
                    DFS(i);
                }
            }
            for (int i = 1; i <= a; i++) {
                for (int j = 0; j < 1005; j++) {
                    check[j] = false;
                }
                check[i] = true;
                int count = 0;
                for (int j = 1; j <= a; j++) {
                    if(check[j] == false){
                        count++;
                        DFS(j);
                    }
                }
                if(count > res) System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
