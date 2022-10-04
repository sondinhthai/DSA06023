import java.util.Scanner;
import java.util.Stack;

public class KiemTraCacCapDauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while (test-- > 0) {
            String s = sc.nextLine();
            if (check(s)) System.out.println("true");
            else System.out.println("false");
        }
    }

    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            } else {
                if (!stack.isEmpty()) {
                    if (s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                    else if (s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                    else if (s.charAt(i) == '}' && stack.peek() == '{') stack.pop();
                    else return false;
                } else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
