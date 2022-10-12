import java.util.*;

public class DuongDi1 {
    static ArrayList<Integer> ke[] = new ArrayList[1001];
    static boolean chuaXet[] = new boolean[1001];
    static int truoc[] = new int[1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(), m = scanner.nextInt(), s = scanner.nextInt(), e = scanner.nextInt();
            for (int i = 0; i < 1001; i++) {
                ke[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt(), v = scanner.nextInt();
                ke[u].add(v);
            }
            bfs(s);
            if (chuaXet[e]) {
                System.out.println(-1);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                int x = e;
                while (x != s) {
                    list.add(x);
                    x = truoc[x];
                }
                list.add(s);
                Collections.reverse(list);
                for (int k : list)
                    System.out.print(k + " ");
                System.out.println();
            }
        }
    }

    private static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        chuaXet[s] = false;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int x : ke[v]) {
                if (chuaXet[x]) {
                    q.add(x);
                    chuaXet[x] = false;
                    truoc[x] = v;
                }
            }
        }
    }
}
