package J05009;

import java.util.ArrayList;
import java.util.Scanner;

class ThiSinh {
    private String name, ngaySinh;
    private double d1, d2, d3;
    private int id;

    public ThiSinh(int id, String name, String ngaySinh, double d1, double d2, double d3) {
        super();
        this.id = id;
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getMark() {
        return d1 + d2 + d3;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + ngaySinh + " " + getMark();
    }

}

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double MaxPoint = 0;
        ArrayList<ThiSinh> data = new ArrayList<ThiSinh>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            ThiSinh a = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            data.add(a);
            MaxPoint = Math.max(MaxPoint, a.getMark());
        }
        for (ThiSinh i : data) {
            if (i.getMark() == MaxPoint) {
                System.out.println(i);
            }
        }
    }
}
