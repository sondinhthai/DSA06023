import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoMayManTiepTheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        BigInteger sum = new BigInteger("0");
        Queue<Long> queue = new LinkedList<>();
        queue.add(4l);
        queue.add(7l);
        while (true){
            long num = queue.poll();
            if (num >= a && num < b){
                if (a <= num){
                    sum = new BigInteger((num - a + 1) + "").multiply(new BigInteger(num + "")).add(sum);
                    a = num + 1;
                }
            }

            if (num >= b){
                sum = new BigInteger((b - a + 1) + "").multiply(new BigInteger(num + "")).add(sum);
                break;
            }

            queue.add(num * 10 + 4);
            queue.add(num * 10 + 7);
        }
        System.out.println(sum);
    }
}
