import java.util.Scanner;

public class ChuViTamGiac {
    public static double tinhTamGiac(PointTamGiac p1, PointTamGiac p2, PointTamGiac p3){
        double d1 = Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
        double d2 = Math.sqrt((p2.x-p3.x)*(p2.x-p3.x) + (p2.y-p3.y)*(p2.y-p3.y));
        double d3 = Math.sqrt((p1.x-p3.x)*(p1.x-p3.x) + (p1.y-p3.y)*(p1.y-p3.y));

        if (d1 + d2 <= d3 || d2 + d3 <= d1 || d1 + d3 <= d2){
            return 0;
        }

        return d1 + d2 + d3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();

            PointTamGiac p1 = new PointTamGiac(x1, y1);
            PointTamGiac p2 = new PointTamGiac(x2, y2);
            PointTamGiac p3 = new PointTamGiac(x3, y3);

            if (tinhTamGiac(p1, p2, p3) == 0){
                System.out.println("INVALID");

            } else {
                System.out.println(String.format("%.3f", tinhTamGiac(p1, p2, p3)));
            }
        }
    }
}

class PointTamGiac{
    double x;
    double y;

    public PointTamGiac(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
