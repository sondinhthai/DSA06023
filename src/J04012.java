import java.util.Scanner;

public class J04012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoTen = scanner.nextLine();
        int luongCoBan = Integer.parseInt(scanner.nextLine());
        int soNgayCong = Integer.parseInt(scanner.nextLine());
        String chucVu = scanner.nextLine();

        NhanVienJ04012 nhanVienJ04012 = new NhanVienJ04012("NV01", hoTen, luongCoBan, soNgayCong, chucVu);
        nhanVienJ04012.tinhCong();
        System.out.println(nhanVienJ04012);
    }
}

class NhanVienJ04012{
    private String maNV;
    private String hoTen;
    private int luongCoBan;
    private int soNgayCong;
    private String chucVu;

    public int thuong;
    public int phucap;

    public int thuNhap;

    public NhanVienJ04012(String maNV, String hoTen, int luongCoBan, int soNgayCong, String chucVu) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    public void tinhCong(){

        if (soNgayCong >= 25){
            thuong = (int) (0.2*luongCoBan*soNgayCong);
        } else if (soNgayCong >= 22 && soNgayCong < 25){
            thuong = (int) (0.1*luongCoBan*soNgayCong);
        } else if (soNgayCong < 22){
            thuong = 0;
        }

        if (chucVu.equals("GD")){
            phucap = 250000;
        } else if (chucVu.equals("PGD")){
            phucap = 200000;
        } else if (chucVu.equals("TP")){
            phucap = 180000;
        } else if (chucVu.equals("NV")){
            phucap = 150000;
        }

        thuNhap = (luongCoBan*soNgayCong) + thuong + phucap;
    }

    @Override
    public String toString(){

        return maNV + " " + hoTen + " " + (luongCoBan*soNgayCong) + " " + thuong + " " + phucap + " " + thuNhap;
    }
}
