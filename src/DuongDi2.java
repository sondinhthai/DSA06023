import java.util.*;

public class DuongDi2 {
    public static boolean[] chuaxet = new boolean[1001];
    public static int[][] ke = new int[1001][1001];
    public static int n, m, dinh;
    public static int[] truoc = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            reset();
            n = sc.nextInt();
            m = sc.nextInt();
            dinh = sc.nextInt();

            for (int i = 1; i <= m; i++) {
                int f = sc.nextInt();
                int s = sc.nextInt();

                ke[f][s] = ke[s][f] = 1;
            }
            for (int i = 1; i <= n; i++) {
                BFS(dinh);
                if (i != dinh) {
                    trace(dinh, i);
                }
            }
        }
    }

    public static void BFS(int u) {
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        chuaxet[u] = false;
        while (!q.isEmpty()) {
            int front = q.poll();
            for (int i = 1; i <= n; i++) {
                if (ke[front][i] == 1 && chuaxet[i]) {
                    q.add(i);
                    chuaxet[i] = false;
                    truoc[i] = front;
                }
            }
        }
    }

    public static void trace(int u, int v) {
        if (chuaxet[v]) {
            System.out.println("No path");
            return;
        }
        List<Integer> lst = new ArrayList<>();

        while (u != v) {
            if (v == 0) {
                System.out.println("No path");
                return;
            }
            lst.add(v);
            v = truoc[v];
        }

        lst.add(u);
        if (lst.size() == 1) {
            System.out.println("No path");
            return;
        }

        for (int i = lst.size() - 1; i >= 0; i--) {
            System.out.print(lst.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void reset() {
        for (int i = 0; i < 1001; i++) {
            chuaxet[i] = true;
            for (int j = 0; j < 1001; j++) {
                ke[i][j] = 0;
            }
        }
    }
}
