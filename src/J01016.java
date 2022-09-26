import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        String n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLine();
        List<String> list4 = new ArrayList<>();
        List<String> list7 = new ArrayList<>();
        for (int i = 0 ; i<n.length();i++){
            if (String.valueOf(n.charAt(i)).equals("4")) list4.add(String.valueOf(n.charAt(i)));
            if (String.valueOf(n.charAt(i)).equals("7")) list7.add(String.valueOf(n.charAt(i)));
        }

        if (list4.size() + list7.size() == 4 || list4.size() + list7.size() == 7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
