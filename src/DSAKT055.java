import java.util.Vector;

public class DSAKT055 {
    public static int MinimumCost(int cost[], int n,
                                  int W)
    {
        Vector<Integer> val = new Vector<Integer>();
        Vector<Integer> wt = new Vector<Integer>();

        int size = 0;
        for (int i = 0; i < n; i++)
        {
            if (cost[i] != -1)
            {
                val.add(cost[i]);
                wt.add(i + 1);
                size++;
            }
        }

        n = size;
        int min_cost[][] = new int[n+1][W+1];

        for (int i = 0; i <= W; i++)
            min_cost[0][i] = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++)
            min_cost[i][0] = 0;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= W; j++)
            {
                if (wt.get(i-1) > j)
                    min_cost[i][j] = min_cost[i-1][j];
                else
                    min_cost[i][j] = Math.min(min_cost[i-1][j],
                            min_cost[i][j-wt.get(i-1)] +
                                    val.get(i-1));
            }
        }

        return (min_cost[n][W] == Integer.MAX_VALUE)? -1:
                min_cost[n][W];
    }

    public static void main(String[] args)
    {
        int cost[] = {1, 2, 3, 4, 5}, W = 5;
        int n = cost.length;

        System.out.println(MinimumCost(cost, n, W));
    }
}
