import java.util.*;

public class HeThongDien {
    static int a[], index1[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(),m=sc.nextInt();
        int e = sc.nextInt();
        int a[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {


            a[i] = Integer.MAX_VALUE;


        }
        int h[] = new int [m];
        for(int i=0;i<m;i++){
            h[i] =sc.nextInt();
        }
        ArrayList<Vector<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new Vector<>());
        for(int i = 0;i<e;i++){
            int u=sc.nextInt(),v=sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i=0;i<m;i++){
            BFS(adj,h[i],a);
        }
        int maxi = 0;
        for(int i=1;i<n;i++){
            if(a[maxi]<a[i]) maxi=i;

        } System.out.println(maxi);
    }
    public static void BFS(ArrayList<Vector<Integer>> adj,int k,int[]flag){
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        flag[k]=0;
        while(!q.isEmpty()){
            int u =q.poll();
            for(Integer v : adj.get(u)){
                if(flag[u]+1<flag[v]){
                    flag[v] = flag[u]+1;
                    q.add(v);
                }
            }
        }
    }
}
