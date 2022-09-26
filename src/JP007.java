import java.util.Scanner;
import java.util.TreeSet;

public class JP007 {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()){
            s.add(scanner.nextLine().toLowerCase().trim());
        }

        for (String s1 : s){
            System.out.println(s1);
        }
    }
}
