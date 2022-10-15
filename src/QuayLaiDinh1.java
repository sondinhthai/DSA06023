import java.util.*;

public class QuayLaiDinh1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            int a[][] = new int[n+1][n+1];
            for(int i=0;i<e;i++){
                int u =sc.nextInt(),v=sc.nextInt();
                a[u][v]=1;
            }
            TreeSet<Integer> tr = new TreeSet<>();
            BFS(a, 1, 2, tr);
            BFS(a, 2, 1, tr);
            System.out.println(tr.size());
        }
    }
    public static void BFS(int a[][],int k,int end,TreeSet<Integer> tr){
        int flag[] = new int [a.length];
        flag[k]=-1;
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        while(!q.isEmpty()){
            int u = q.poll();
            for(int i=1;i<a[u].length;i++){
                if(a[u][i]==1){
                    if(flag[i]==0){
                        flag[i] = u;
                        q.add(i);
                    }
                }
            }
        }
        tr.add(k);
        while(flag[end]!=-1){
            if(end==0) return;
            tr.add(end);
            a[end][flag[end]] =0;
            end = flag[end];
        }
    }
}
