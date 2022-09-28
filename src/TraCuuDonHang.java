import java.util.Scanner;

public class TraCuuDonHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while (n-->0){
            String tenHang = scanner.nextLine();
            String maDonHang = scanner.nextLine();
            int donGia = Integer.parseInt(scanner.nextLine());
            int soLuong = Integer.parseInt(scanner.nextLine());

            MatHang matHang = new MatHang(tenHang, maDonHang, donGia, soLuong);
            matHang.check();
            System.out.println(matHang);
        }
    }
}

class MatHang{
    private String tenHang;
    private String maHang;
    private int donGia;
    private int soLuong;

    private int giamGia;
    private String soThuTuDonHang;
    private String loai;

    public MatHang(String tenHang, String maHang, int donGia, int soLuong) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void check(){
        soThuTuDonHang = String.valueOf(maHang.charAt(1) + maHang.charAt(2) + maHang.charAt(3));
        loai = String.valueOf(maHang.charAt(4));

        if (loai.equals("1")){
            giamGia = (int) (0.3*donGia*soLuong);
        } else {
            giamGia = (int) (0.5*donGia*soLuong);
        }
    }

    @Override
    public String toString(){
        return tenHang + " " + maHang + " " + soThuTuDonHang + " " + giamGia + " " + (donGia * soLuong - giamGia);
    }
}
