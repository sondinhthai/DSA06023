import java.util.*;

public class KiemTraChuTrinh {
    static boolean[] visit = new boolean[1005];
    static boolean kt = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            Arrays.fill(visit, false);
            kt = false;
            int v = sc.nextInt();
            int e = sc.nextInt();
            Vector<Integer>[] graph = new Vector[v + 5];
            for (int i = 0; i < v + 5; i++) {
                graph[i] = new Vector<Integer>();
            }
            for (int i = 0; i < e; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                graph[x].add(y);
                graph[y].add(x);
            }
            for (int i = 1; i <= v; i++) {
                dfs(i, graph, 0);
                Arrays.fill(visit, false);
                if (kt) break;
            }
            if (kt) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static void dfs(int u, Vector<Integer>[] vect, int t) {
        visit[u] = true;
        for (int i = 0; i < vect[u].size(); i++) {
            if (!visit[vect[u].get(i)]) {
                dfs(vect[u].get(i), vect, u);
            }
            else if (t != vect[u].get(i)) {
                kt = true;
            }
        }
    }
}
