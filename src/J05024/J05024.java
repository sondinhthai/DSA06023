package J05024;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05024 {
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
            String nganh = "";
            String querry = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + querry.toUpperCase() + ":");
            for (SinhVien sinhVien : list){
                String maNganh = String.valueOf(sinhVien.getMaSV().charAt(5)) + String.valueOf(sinhVien.getMaSV().charAt(6));
//                if (maNganh.equals("DCKT")){
//                    nganh = "Ke toan";
//                } else if (maNganh.equals("DCCN") && !String.valueOf(sinhVien.getLop().charAt(0)).equals("E")) {
//                    nganh = "Cong nghe thong tin";
//                } else if (maNganh.equals("DCAT") && !String.valueOf(sinhVien.getLop().charAt(0)).equals("E")) {
//                    nganh = "An toan thong tin";
//                } else if (maNganh.equals("DCDT")) {
//                    nganh = "Dien tu";
//                } else if (maNganh.equals("DCVT")) {
//                    nganh = "Vien thong";
//                }
                String[] item = querry.split(" ");
                String res = String.valueOf(item[0].charAt(0)) + String.valueOf(item[1].charAt(0));
                if (res.equalsIgnoreCase(maNganh) && !String.valueOf(sinhVien.getLop().charAt(0)).equals("E")){
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
