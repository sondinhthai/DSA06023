import java.text.DecimalFormat;
import java.util.Scanner;

public class J04007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoten = scanner.nextLine();
        String gioitinh = scanner.nextLine();
        String ngaysinh = scanner.nextLine();
        String dichi = scanner.nextLine();
        String masothue = scanner.nextLine();
        String ngayKiHD = scanner.nextLine();


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

        String date = ngay + "/" + thang + "/" + nam;



        String[] dateArr1 = ngayKiHD.split("/");
        String ngay1 = "", thang1 = "", nam1 = "";
        ngay1 = dateArr1[0];
        thang1 = dateArr1[1];
        nam1 = dateArr1[2];
        if (Integer.parseInt(dateArr1[0]) < 10) {
            ngay1 = "0" + dateArr1[0];
        }

        if (Integer.parseInt(dateArr1[1]) < 10) {
            thang1 = "0" + dateArr1[1];
        }

        String date1 = ngay1 + "/" + thang1 + "/" + nam1;

        NhanVien nhanVien = new NhanVien("00001", hoten, gioitinh, date, dichi, masothue, date1);

        System.out.println(nhanVien.getMaNV() + " "
                            + nhanVien.getHoTen() + " "
                            + nhanVien.getGioiTinh() + " "
                            + nhanVien.getNgaySinh() + " "
                            + nhanVien.getDiaChi() + " "
                            + nhanVien.getMaSoThue() + " "
                            + nhanVien.getNgayKyHD() + " ");
    }
}

class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKyHD;

    public NhanVien(String maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHD) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHD = ngayKyHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public String getNgayKyHD() {
        return ngayKyHD;
    }

    public void setNgayKyHD(String ngayKyHD) {
        this.ngayKyHD = ngayKyHD;
    }
}
