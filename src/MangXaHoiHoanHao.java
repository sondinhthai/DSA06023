import java.util.*;

public class MangXaHoiHoanHao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            ArrayList<Vector<Integer>> a = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                a.add(new Vector<>());
            }
            for (int i = 0; i < e; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                a.get(v).add(u);
                a.get(u).add(v);
            }
            int flag[] = new int[n + 1];
            boolean ok = true;
            for (int i = 1; i <= n; i++) {
                if (flag[i] == 0) {
                    ok = BFS(a, i, flag);
                    if (!ok) {
                        break;
                    }
                }
            }
            if (ok) {
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }

    public static boolean BFS(ArrayList<Vector<Integer>> adj, int k, int[] flag) {
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        flag[k] = 1;
        TreeSet<Integer> tr = new TreeSet<>();
        while (!q.isEmpty()) {
            int u = q.poll();
            tr.add(u);
            for (Integer v : adj.get(u)) {
                if (flag[v] == 0) {
                    flag[v] = 1;
                    q.add(v);

                }
            }
        }
        for (Integer i : tr) {
            if (adj.get(i).size() != tr.size() - 1) {
                return false;
            }
        }
        return true;
    }
}
