import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KiemTraChuTrinh {
    static class Graph {
        int vertices;
        List<Integer>[] adjList;

        public Graph(int vertices) {
            this.vertices = vertices;
            adjList = new List[1005];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new ArrayList<>();
            }
        }

        public void addEdge(int source, int destination) {
            adjList[source].add(destination);
        }

        public boolean isCycle() {
            boolean visited[] = new boolean[1005];
            boolean recursiveArr[] = new boolean[1005];

            for (int i = 0; i < vertices; i++) {
                if (isCycleUtil(i, visited, recursiveArr))
                    return true;
            }
            return false;
        }

        public boolean isCycleUtil(int vertex, boolean[] visited, boolean[] recursiveArr) {
            visited[vertex] = true;
            recursiveArr[vertex] = true;

            for (int i = 0; i < adjList[vertex].size(); i++) {

                int adjVertex = adjList[vertex].get(i);
                if (!visited[adjVertex] && isCycleUtil(adjVertex, visited, recursiveArr)) {
                    return true;
                } else if (recursiveArr[adjVertex])
                    return true;
            }
            recursiveArr[vertex] = false;
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            Graph graph = new Graph(v);
            for (int i = 0; i < e; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph.addEdge(a, b);
            }
            boolean result = graph.isCycle();
            if (result) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
