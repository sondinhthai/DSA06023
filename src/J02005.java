import java.util.Scanner;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>();
        TreeSet<Integer> b = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        for (int i = 0;i<n;i++){
            arr1[i] = scanner.nextInt();
            a.add(arr1[i]);
        }
        for (int i = 0;i<m;i++){
            arr2[i] = scanner.nextInt();
            b.add(arr2[i]);
        }

        a.retainAll(b);
        for(Integer number : a){
            System.out.print(number + " ");
        }
    }
}
