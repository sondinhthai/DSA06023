import java.util.*;

public class CayKhungCuaDoThiTheoBFS {
    private static Queue<Integer> q;
    private static boolean[] cx = new boolean[1001];
    private static ArrayList<Integer>[] ke = new ArrayList[1001];
    private static int sc;
    private static int V, E;

    private static void bfs(int u) {
        q = new LinkedList<Integer>();
        sc = 0;
        q.add(u);
        cx[u] = false;
        List<Integer> kq = new ArrayList<>();
        while (!q.isEmpty()) {
            int t = q.poll();
            for (Integer i : ke[t]) {
                if (cx[i]) {
                    sc++;
                    kq.add(t);
                    kq.add(i);
                    cx[i] = false;
                    q.add(t);
                    q.add(i);
                }
            }
        }
        if (sc == V - 1) {
            for (int i = 0; i < kq.size(); i += 2) {
                System.out.println(kq.get(i) + " " + kq.get(i + 1));
            }
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            V = sc.nextInt();
            E = sc.nextInt();
            int u = sc.nextInt();
            for (int i = 1; i <= V; i++) {
                ke[i] = new ArrayList<Integer>();
                cx[i] = true;
            }
            for (int i = 0; i < E; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                ke[a].add(b);
                ke[b].add(a);
            }
            bfs(u);
        }

    }
}
