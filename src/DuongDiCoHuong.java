import java.util.*;

public class DuongDiCoHuong {
    static int v, e;
    static ArrayList<Integer> list[] = new ArrayList[1001];
    static boolean chuaxet[] = new boolean[1001];
    static int parent[] = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            v = sc.nextInt();
            e = sc.nextInt();
            int stat = sc.nextInt();
            int en = sc.nextInt();
            for (int i = 0; i <= v; i++) {
                list[i] = new ArrayList<>();
                chuaxet[i] = true;
                parent[i] = 0;
            }
            for (int i = 1; i <= e; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                list[a].add(b);
            }
            bfs(stat, en);
            if (chuaxet[en]) {
                System.out.println(-1);
            } else {
                ArrayList<Integer> res = new ArrayList<>();
                int x = en;
                while (x != stat) {
                    res.add(x);
                    x = parent[x];
                }
                res.add(stat);
                Collections.reverse(res);
                for (Integer res1 : res) {
                    if (res1 != en) {
                        System.out.print(res1 + " -> ");
                    } else {
                        System.out.print(res1);
                    }
                }
                System.out.println("");
            }
        }
    }

    private static void bfs(int stat, int en) {
        Queue<Integer> q = new LinkedList<>();
        q.add(stat);
        chuaxet[stat] = false;
        while (!q.isEmpty()) {
            int v = q.poll();
            for (Integer num : list[v]) {
                if (chuaxet[num]) {
                    q.add(num);
                    chuaxet[num] = false;
                    parent[num] = v;
                }
            }
        }
    }
}
