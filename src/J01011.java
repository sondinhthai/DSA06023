import java.util.Scanner;

public class J01011 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t;
        t = scanner.nextInt();
        while (t --> 0){
            long a = scanner.nextInt();

            long b = scanner.nextInt();

            System.out.println(BSCNN(a, b) + " " + USCLN(a, b));
        }

    }
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }
}
