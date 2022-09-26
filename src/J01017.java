import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        String n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLine();

        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i<n.length();i++){
            int e = Integer.parseInt(String.valueOf(n.charAt(i)));
            list.add(e);
        }

        for (int i=0;i<list.size();i++){
            if (Math.abs(list.get(i+1) - list.get(i)) == 1) System.out.println("YES");
        }
    }
}
