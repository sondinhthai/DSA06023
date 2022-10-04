package TN02019;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class TN02019 {
    public static class KhachHang implements Comparable<KhachHang> {

        private String ma, hoTen, soPhong, NgayNhanPhong, NgayTraPhong;
        private long donGia, tienDichVu, soNgayO, thanhTien;
        private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        public KhachHang(long stt, String hoTen, String soPhong, String NgayNhanPhong, String NgayTraPhong, long tienDichVu) {
            this.ma = "KH" + String.format("%02d", stt);
            this.hoTen = hoTen;
            this.NgayNhanPhong = NgayNhanPhong;
            this.NgayTraPhong = NgayTraPhong;
            this.soPhong = soPhong;
            this.tienDichVu = tienDichVu;
            this.soNgayO = tinhSoNgay(NgayNhanPhong, NgayTraPhong);
            this.donGia = tinhDonGia(soPhong);
            this.thanhTien = donGia * soNgayO + tienDichVu;
        }

        private long tinhSoNgay(String NgayNhanPhong, String NgayTraPhong) {
            long diff = -1;
            try {
                Date dateStart = simpleDateFormat.parse(NgayNhanPhong);
                Date dateEnd = simpleDateFormat.parse(NgayTraPhong);
                diff = Math.round((dateEnd.getTime() - dateStart.getTime()) / (double) 86400000);
            } catch (Exception e) {
            }
            return diff+1;
        }

        private long tinhDonGia(String soPhong) {
            char x = soPhong.charAt(0);
            if (x == '1') {
                return 25;
            } else if (x == '2') {
                return 34;
            } else if (x == '3') {
                return 50;
            } else {
                return 80;
            }
        }

        @Override
        public int compareTo(KhachHang n) {
            if (this.thanhTien < n.thanhTien) {
                return 1;
            }
            return -1;
        }

        @Override
        public String toString() {
            return ma + " " + hoTen + " " + soPhong + " " + soNgayO + " " + thanhTien;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> listXD = new ArrayList<>();
        for (long i = 1; i <= t; i++) {

            listXD.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(listXD);
        listXD.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }
}
