
import java.text.*;
import java.util.Date;
import java.util.Scanner;

public class J04007 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String hoten = scanner.nextLine();
        String gioitinh = scanner.nextLine();
        String ngaysinh = scanner.nextLine();
        String dichi = scanner.nextLine();
        String masothue = scanner.nextLine();
        String ngayKiHD = scanner.nextLine();

        NhanVien nhanVien = new NhanVien("00001", hoten, gioitinh, ngaysinh, dichi, masothue, ngayKiHD);

        System.out.println(nhanVien);
    }
}

class NhanVien {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String maSoThue;
    private Date ngayKyHD;

    public NhanVien(String maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHD) throws ParseException {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHD = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKyHD);
    }
    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + gioiTinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) +
                " " + diaChi + " " + maSoThue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayKyHD);
    }

}
