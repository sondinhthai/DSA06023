import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class J05006 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i=1;i<=n;i++){
            String hoten = scanner.nextLine();
            String gioitinh = scanner.nextLine();
            String ngaysinh = scanner.nextLine();
            String dichi = scanner.nextLine();
            String masothue = scanner.nextLine();
            String ngayKiHD = scanner.nextLine();

            NhanVienJ05006 nhanVien = new NhanVienJ05006(String.format("%05d", i), hoten, gioitinh, ngaysinh, dichi, masothue, ngayKiHD);

            System.out.println(nhanVien);
        }


    }
}

class NhanVienJ05006 {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String maSoThue;
    private Date ngayKyHD;

    public NhanVienJ05006(String maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHD) throws ParseException {
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
