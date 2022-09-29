import java.util.Scanner;


public class J04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

class Triangle{
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid() {
        double ab = Point.distance(this.a, this.b);
        double bc = Point.distance(this.b, this.c);
        double ca = Point.distance(this.c, this.a);
        return ((ab + bc > ca) && (bc + ca > ab) && (ca + ab > bc));
    }

    public double getPerimeter() {
        double ab = Point.distance(this.a, this.b);
        double bc = Point.distance(this.b, this.c);
        double ca = Point.distance(this.c, this.a);
        double res = ab + bc + ca;
        return (double) Math.round(res*1000)/1000;
    }
}
class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextFloat(), sc.nextFloat());
    }

    public static double distance(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

}