import java.util.*;

public class BienDoiSoTuNhien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            Long n = scanner.nextLong();
            Queue<Long> queue = new LinkedList<>();
            queue.add(n);
            Map<Long, Integer> map = new HashMap<>();
            map.put(n, 0);
            while (!queue.isEmpty()){
                long number = queue.poll();
                int buoc = map.get(number);
                if (number - 1 == 1){
                    System.out.println(buoc + 1);
                    break;
                }
                if (number - 1 > 0 && map.get(number-1) == null){
                    map.put(number-1, buoc+1);
                    queue.add(number-1);
                }

                for (int i = 2;i<=Math.sqrt(number);i++){
                    if (number % i == 0){
                        if (map.get(number/i) ==  null){
                            map.put(number/i, buoc+1);
                            queue.add(number/i);
                        }
                    }
                }
            }
        }
    }
}
