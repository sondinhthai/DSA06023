import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class CayKhungCuaDoThiTheoDFS {
    private static Stack<Integer> st;
    private static boolean[] cx = new boolean[1001];
    private static ArrayList<Integer>[] ke = new ArrayList[1001];
    private static int sc;
    private static int V, E;
    private static void dfs(int u) {
        st = new Stack<Integer>();
        sc = 0;
        st.push(u);
        cx[u] = false;
        List<Integer> kq = new ArrayList<>();
        while (!st.isEmpty()) {
            int t = st.pop();
            for (Integer i : ke[t]) {
                if (cx[i]) {
                    sc++;
                    kq.add(t);
                    kq.add(i);
                    cx[i] = false;
                    st.push(t);
                    st.push(i);
                    break;
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
            dfs(u);
        }
    }
}
