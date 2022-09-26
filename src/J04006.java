import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J04006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoten = scanner.nextLine();
        String lop = scanner.nextLine();
        String ngaysinh = scanner.nextLine();
        double diemGPA = scanner.nextDouble();

        DecimalFormat df = new DecimalFormat("#.##");

        String[] dateArr = ngaysinh.split("/");
        String ngay = "", thang = "", nam = "";
        ngay = dateArr[0];
        thang = dateArr[1];
        nam = dateArr[2];
        if (Integer.parseInt(dateArr[0]) < 10) {
            ngay = "0" + dateArr[0];
        }

        if (Integer.parseInt(dateArr[1]) < 10) {
            thang = "0" + dateArr[1];
        }

        String date = ngay+"/" +thang+"/"+nam;
        SinhVien sinhVien = new SinhVien(hoten, lop, date, diemGPA);
        System.out.println("B20DCCN001" + " " + sinhVien.getHoTen() + " " + sinhVien.getLop() + " " + sinhVien.getNgaySinh() + " " + String.format("%.2f", sinhVien.getDiemGPA()));
    }
}

class SinhVien{
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double diemGPA;

    public SinhVien(String hoTen, String lop, String ngaySinh, double diemGPA) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.diemGPA = diemGPA;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemGPA() {
        return diemGPA;
    }

    public void setDiemGPA(double diemGPA) {
        this.diemGPA = diemGPA;
    }
}