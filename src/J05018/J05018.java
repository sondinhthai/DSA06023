package J05018;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

class HocSinh {
    private String name, id, overall;
    private BigDecimal point;

    public HocSinh(int id, String name, BigDecimal data) {
        super();
        if (id < 10)
            this.id = "HS0" + id;
        else
            this.id = "HS" + id;
        this.name = name;
        this.point = data;

        if (this.point.doubleValue() < 5)
            overall = "YEU";
        else if (this.point.doubleValue() < 7)
            overall = "TB";
        else if (this.point.doubleValue() < 8)
            overall = "KHA";
        else if (this.point.doubleValue() < 9)
            overall = "GIOI";
        else
            overall = "XUAT SAC";
    }

    public BigDecimal getPoint() {
        return this.point;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + point + " " + overall;
    }

}

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> data = new ArrayList<HocSinh>();

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            BigDecimal ans = BigDecimal.valueOf(0);
            BigDecimal[] tmp = new BigDecimal[10];

            for (int j = 0; j < 10; j++) {
                tmp[j] = sc.nextBigDecimal();
                ans = ans.add(tmp[j]);
                if (j < 2)
                    ans = ans.add(tmp[j]);
            }
            ans = ans.divide(BigDecimal.valueOf(12), new MathContext(2));
            data.add(new HocSinh(i, name, ans));
        }

        Collections.sort(data, new Comparator<HocSinh>() {

            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o1.getPoint().equals(o2.getPoint()))
                    return o1.getId().compareTo(o2.getId());
                return o2.getPoint().compareTo(o1.getPoint());
            }
        });

        for (HocSinh i : data) {
            System.out.println(i);
        }
    }
}