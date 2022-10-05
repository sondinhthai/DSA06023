package J07018;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J07018 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine().trim());

        for (int i=1;i<=t;i++){
            SinhVien sv = new SinhVien(i, sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim(), Float.parseFloat(sc.nextLine()));
            System.out.println(sv);
        }
    }
}
class SinhVien {
    private String maSV, hoten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int i, String hoten,String lop, String ngaysinh, float gpa) throws ParseException {
        this.hoten = chuanhoa(hoten);
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
        if(i < 10) {
            maSV = "B20DCCN00" + i;
        } else {
            maSV = "B20DCCN0" + i;
        }
    }

    public static String chuanhoa(String a) {
        String s[] = a.split(" ");
        String result = "";
        for(int i = 0; i < s.length; i++) {
            if(s[i].length() > 0) {
                s[i] = s[i].toLowerCase();
                result += s[i].substring(0, 1).toUpperCase() + s[i].substring(1, s[i].length()) + " ";
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return maSV + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}
