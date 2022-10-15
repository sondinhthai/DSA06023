import java.util.*;

public class QuanMa {
    static final int indexX[] = {-2, -2, -1, -1, 1, 1, 2, 2};
    static final int indexY[] = {-1, 1, -2, 2, -2, 2, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int xe = sc.nextInt(), ye = sc.nextInt();
            int n = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();
            map.put(genK(0, 0), 0);
            for(int i=0;i<n;i++){
                int x = sc.nextInt(),y=sc.nextInt();
                map.put(genK(x, y), -1);
            }
            Queue<String> q = new LinkedList<>();
            q.add(genK(0, 0));
            while (!q.isEmpty()) {
                String w[] = q.poll().split(" ");

                int x = Integer.parseInt(w[0]);
                int y = Integer.parseInt(w[1]);
                String key = genK(x, y);
                if (x == xe && y == ye) {
                    break;
                }
                for (int i = 0; i < 8; i++) {
                    String k = genK(x + indexX[i], y + indexY[i]);
                    if (k.isEmpty()) {
                        continue;
                    }
                    if (!map.containsKey(k)) {
                        map.put(k, map.get(key)+1);
                        q.add(k);
                    }
                }
            }
            System.out.println(map.get(genK(xe, ye)));
        }

    }

    static String genK(int x, int y) {
        String res = "";
        if (x <= 1000 && y <= 1000 && x >= -1000 && y >= -1000) {
            res = x + " " + y;
        }
        return res;
    }

    public static void BFS(ArrayList<Vector<Pair<Integer, Integer>>> adj, int k, int[] flag) {
        Queue<Pair<Integer, Integer>> q = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1.getSecond(), o2.getSecond());
        });
        q.add(new Pair<Integer, Integer>(k, 0));
        flag[k] = 0;
        while (!q.isEmpty()) {
            Pair<Integer, Integer> p = q.poll();
            for (Pair<Integer, Integer> p1 : adj.get(p.getFirst())) {
                if (p1.getSecond() + p.getSecond() < flag[p1.getFirst()]) {
                    flag[p1.getFirst()] = p1.getSecond() + p.getSecond();
                    q.add(new Pair<Integer, Integer>(p1.getFirst(), flag[p1.getFirst()]));
                }
            }
        }
    }
}

class Pair<T1, T2> {

    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

}
