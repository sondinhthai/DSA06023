import java.util.*;

public class DinhThat {
    static ArrayList<Integer> dske[] = new ArrayList[20001];
    static boolean chuaxet[] = new boolean[20001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            int start = in.nextInt();
            int end = in.nextInt();
            for (int i = 1; i <= n; i++) {
                dske[i] = new ArrayList<>();
            }
            for (int i = 1; i <= m; i++) {
                int u = in.nextInt(), v = in.nextInt();
                dske[u].add(v);
            }
            int dem = 0;
            for (int j = 1; j <= n; j++) {
                if (j == start || j == end) continue;
                Arrays.fill(chuaxet,true);
                chuaxet[j] = false;
                bfs(start);
                if(chuaxet[end]) dem++;
            }
            System.out.println(dem);
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
