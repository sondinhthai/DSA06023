import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DiemNutGiaoTrongYeu {
    private static ArrayList<Integer>[] ke = new ArrayList[50001];
    private static boolean[] cx = new boolean[20001];

    private static void dfs(int u){
        cx[u] = false;
        for(Integer i : ke[u]){
            if(cx[i]){
                dfs(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int V = sc.nextInt();
            int E = sc.nextInt();
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
            List<Integer> res = new ArrayList<>();
            for(int i = 1; i <= V; i++){
                Arrays.fill(cx, true);
                cx[i] = false;
                int dem = 0;
                for(int j = 1; j <= V ; j++){
                    if(cx[j]){
                        dem++;
                        dfs(j);
                    }
                }
                if(dem > 1){
                    res.add(i);
                }
            }
            System.out.println(res.size());
            for(Integer i : res){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
