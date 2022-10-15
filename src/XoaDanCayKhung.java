import java.util.*;

public class XoaDanCayKhung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<Vector<Integer>> a = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                a.add(new Vector<>());
            }
            for (int i = 0; i < n - 1; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                a.get(v).add(u);
                a.get(u).add(v);
            }
            int flag[] = new int[n + 1];
            for (int i = 0; i < m; i++) {
                if (!cayKhung(a, flag)) {
                    for (int j = 1; j <= n; j++) {
                        flag[j] = 1;
                    }
                    break;
                }
            }
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (flag[i] == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean cayKhung(ArrayList<Vector<Integer>> adj, int[] flag) {
        Queue<Integer> q = new LinkedList<>();
        boolean hasNode = false;
        for (int i = 1; i < adj.size(); i++) {
            if (adj.get(i).size() == 1) {
                flag[i] = 1;
                q.add(i);
                hasNode = true;

            }
        }
        while (!q.isEmpty()) {
            int i = q.poll();
            for (Integer v : adj.get(i)) {
                adj.get(v).remove(new Integer(i));
            }
            adj.get(i).clear();
        }
        return hasNode;
    }
}
