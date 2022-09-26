import java.util.Scanner;

public class TN08 {
    static String nextGreater(String num) {
        int l = num.length();
        int i;

        for (i = l - 1; i >= 0; i--) {
            if (num.charAt(i) == '0') {
                num = num.substring(0, i) + '1' + num.substring(i+1);
                break;
            }
            else {
                num = num.substring(0, i) + '0' + num.substring(i + 1);
            }
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        scanner.nextLine();
        while (t-->0){
            String num = scanner.nextLine();
            System.out.println(nextGreater(num));
        }

    }
}
