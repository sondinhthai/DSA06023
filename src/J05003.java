import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J05003 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            SinhVienJ05003 a = new SinhVienJ05003(i, in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
            a.chuanHoaTen();
            System.out.println(a);
        }
    }
}

class SinhVienJ05003 {
    private String ma, ten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVienJ05003(int id, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    public void chuanHoaTen() {
        ten = ten.trim().toLowerCase();
        ten = ten.replaceAll("\\s+", " ");
        String[] temp= ten.split(" ");

        ten="";
        for(int i=0;i<temp.length;i++) {
            ten+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                ten+=" ";
        }
    }

    @Override
    public String toString() {

        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) +
                " " + String.format("%.2f", gpa);
    }
}