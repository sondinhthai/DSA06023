import java.util.Scanner;

public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh ts = new TuyenSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        System.out.println(ts);
    }
}

class TuyenSinh {
    private String ma;
    private String ten;
    private double diemtoan;
    private double diemly;
    private double diemhoa;
    private double diemthuong;
    private String trangthai;
    private double tong;
    public TuyenSinh(String ma, String ten, double diemtoan, double diemly, double diemhoa) {
        this.ma = ma;
        this.ten = ten;
        this.diemtoan = diemtoan;
        this.diemly = diemly;
        this.diemhoa = diemhoa;
        this.diemthuong = tinhThuong(ma);
        this.tong = diemtoan * 2 + diemly + diemhoa + diemthuong;
        this.trangthai = status(tong);
    }

    private double tinhThuong(String ma) {
        String kv = ma.substring(0, 3);
        if("KV1".equals(kv)) {
            return (double) 0.5;
        }
        if("KV2".equals(kv)) {
            return 1;
        }
        return (double) 2.5;
    }

    private String status(double tong) {
        if(tong >= 24) {
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
    private String check(double x) {
        if(x == (int) x) {
            return String.format("%d", (int) x);
        }
        return String.format("%.1f", x);
    }
    @Override
    public String toString() {
        return ma + " " + ten + " " + check(diemthuong) + " " + check(tong - diemthuong) + " " + trangthai;
    }
}
