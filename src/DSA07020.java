import java.util.Scanner;
import java.util.StringTokenizer;

public class DSA07020 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        int t;
        t = scanner.nextInt();
        int n = t+1;
        while(n-->0){
            String str;
            str = scanner.nextLine();
            String[] words = str.split(" ");
            String reversedString = "";
            for (int i = 0; i < words.length; i++)
            {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length()-1; j >= 0; j--)
                {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversedString = reversedString + reverseWord + " ";
            }

            System.out.println(reversedString);
        }
    }
}
