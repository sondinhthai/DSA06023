import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05007 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<NhanVienJ05007> list = new ArrayList<>();

        for (int i=1;i<=n;i++){
            String hoten = scanner.nextLine();
            String gioitinh = scanner.nextLine();
            String ngaysinh = scanner.nextLine();
            String dichi = scanner.nextLine();
            String masothue = scanner.nextLine();
            String ngayKiHD = scanner.nextLine();

            NhanVienJ05007 nhanVien = new NhanVienJ05007(String.format("%05d", i), hoten, gioitinh, ngaysinh, dichi, masothue, ngayKiHD);
            list.add(nhanVien);
        }

        list.sort(new Comparator<NhanVienJ05007>() {
            @Override
            public int compare(NhanVienJ05007 o1, NhanVienJ05007 o2) {
                return o1.compareTo(o2);
            }
        });

        for (NhanVienJ05007 nhanVienJ05007: list) {
            System.out.println(nhanVienJ05007);
        }
    }
}
class NhanVienJ05007 {
    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String maSoThue;
    private Date ngayKyHD;

    public NhanVienJ05007(String maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHD) throws ParseException {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHD = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKyHD);
    }

    public int compareTo(NhanVienJ05007 nhanVienJ05007) {
        return (this.ngaySinh.compareTo(nhanVienJ05007.ngaySinh));
    }

    @Override
    public String toString() {
        return maNV + " " + hoTen + " " + gioiTinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) +
                " " + diaChi + " " + maSoThue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayKyHD);
    }

}


