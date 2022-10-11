import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TN14 {
    static int m = 1000000007;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            Queue<Long> value = new PriorityQueue<>();
            for (int i = 0; i < n; i++) value.offer(in.nextLong());
            long minTime = 0;
            for (int i = 0; i < n-1; i++) {
                long day1 = value.poll();
                long day2 = value.poll();
                value.offer((day1+day2)%m);
                minTime = (minTime + day1 + day2)%m;
            }
            System.out.println(minTime);
        }
    }
}
