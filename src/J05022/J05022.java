package J05022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<SinhVien> list = new ArrayList<>();

        while (t-->0){
            String maSV = scanner.nextLine();
            String hoTen = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();

            SinhVien sinhVien = new SinhVien(maSV, hoTen, lop, email);
            list.add(sinhVien);
        }

        int q = Integer.parseInt(scanner.nextLine());
        while (q-->0){
            String querry = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + querry + ":");
            for (SinhVien sinhVien : list){
                if (sinhVien.getLop().equals(querry)){
                    System.out.println(sinhVien);
                }
            }
        }
    }
}

class SinhVien{
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;

    public SinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return maSV + " " + hoTen + " " + lop + " " + email;
    }
}
