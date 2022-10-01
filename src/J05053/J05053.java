package J05053;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J05053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<MatHang> list = new ArrayList<>();

        while (n-->0){
            String tenHang = scanner.nextLine();
            String maDonHang = scanner.nextLine();
            int donGia = Integer.parseInt(scanner.nextLine());
            int soLuong = Integer.parseInt(scanner.nextLine());

            MatHang matHang = new MatHang(tenHang, maDonHang, donGia, soLuong);
            matHang.check();
            list.add(matHang);
        }

        list.sort(new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o1.compareTo(o2);
            }
        });

        for (MatHang matHang : list){
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
        soThuTuDonHang = String.valueOf(maHang.charAt(1)) + String.valueOf(maHang.charAt(2)) + String.valueOf(maHang.charAt(3));
        loai = String.valueOf(maHang.charAt(4));

        if (loai.equals("2")){
            giamGia = (int) (0.3*donGia*soLuong);
        } else {
            giamGia = (int) (0.5*donGia*soLuong);
        }
    }

    public int compareTo(MatHang matHang){
        return soThuTuDonHang.compareTo(matHang.soThuTuDonHang);
    }

    @Override
    public String toString(){
        return tenHang + " " + maHang + " " + soThuTuDonHang + " " + giamGia + " " + (donGia * soLuong - giamGia);
    }
}


