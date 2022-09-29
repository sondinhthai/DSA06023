import java.util.Scanner;

public class KhaiBaoLopPoint {
    public static double distance(Point1 p1, Point1 p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            Point1 p1 = new Point1(x1, y1);
            Point1 p2 = new Point1(x2, y2);

            System.out.println(String.format("%.4f", distance(p1, p2)));
        }
    }
}

class Point1{
    double x;
    double y;

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
