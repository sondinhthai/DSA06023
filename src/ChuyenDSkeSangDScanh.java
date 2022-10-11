import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuyenDSkeSangDScanh {
    static List<Integer>[] list =  new List[1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = Integer.parseInt(str);
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split("\\s");
            for (int j = 0; j < arr.length; j++) {
                list[i].add(Integer.parseInt(arr[j]));
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if(list[i].get(j) > i){
                    System.out.print(i + " ");
                    System.out.println(list[i].get(j));
                }
            }
        }
    }
}
