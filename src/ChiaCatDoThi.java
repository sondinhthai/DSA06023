import java.util.*;

public class ChiaCatDoThi {
    static ArrayList<Integer> dske[] = new ArrayList[20001];
    static boolean chuaxet[] = new boolean[20001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            for (int i = 1; i <= n; i++) {
                dske[i] = new ArrayList<>();
            }
            for (int i = 1; i <= m; i++) {
                int u = in.nextInt(), v = in.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            int max = 0;
            int out = 0;
            for (int j = n; j >= 1; j--) {
                Arrays.fill(chuaxet,true);
                int dem = 0;
                chuaxet[j] = false;
                for (int i = 1; i <= n; i++) {
                    if (chuaxet[i]) {
                        dem++;
                        bfs(i);
                    }
                }
                if (dem == 1) dem = 0;
                if (dem > max) {
                    out = j;
                    max = dem;
                }
            }
            System.out.println(out);
        }

    }

    public static void bfs(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        chuaxet[u] = false;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (Integer x : dske[v]) {
                if (chuaxet[x]) {
                    q.add(x);
                    chuaxet[x] = false;
                }
            }
        }
    }
}
