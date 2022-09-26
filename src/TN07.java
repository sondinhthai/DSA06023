import java.util.Scanner;

public class TN07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean check = true;
        while (check) {
            check = false;
            String ans = "";
            for (int i = 0; i < str.length(); i++) {
                if ((i + 1 < str.length()) && str.charAt(i) == str.charAt(i + 1)) {
                    check = true;
                    for (int j = i + 2; j < str.length(); j++) {
                        ans += str.charAt(j);
                    }
                    str = ans;
                    break;
                } else {
                    ans += str.charAt(i);
                }
            }
            str = ans;
        }
        if (str.equals("")) {
            System.out.println("Empty String");
        } else {
            System.out.println(str);
        }
    }
}
