package HoaDonKhachSan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class HoaDonKhachSan {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<KhachHang> list = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());

        for (int i = 1;i<=t;i++){
            String tenKH = scanner.nextLine();
            String soPhong = scanner.nextLine();
            String ngayNhanPhong = scanner.nextLine();
            String ngayTraPhong = scanner.nextLine();
            int tienDV = Integer.parseInt(scanner.nextLine());

            KhachHang khachHang = new KhachHang("KH" + String.format("%02d", i), tenKH, soPhong, ngayNhanPhong, ngayTraPhong, tienDV);
            khachHang.tinh();
            list.add(khachHang);
        }

        list.sort(new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.compareTo(o2);
            }
        });

        for (KhachHang khachHang : list){
            System.out.println(khachHang);
        }
    }
}

class KhachHang{
    private String maKH;
    private String tenKH;
    private String soPhong;
    private Date ngayNhanPhong;
    private Date ngayTraPhong;
    private int tienDichVu;

    public long soNgay;
    public int tongTien;
    public int donGia;

    public KhachHang(String maKH, String tenKH, String soPhong, String ngayNhanPhong, String ngayTraPhong, int tienDichVu) throws ParseException {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.soPhong = soPhong;
        this.ngayNhanPhong = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhanPhong);
        this.ngayTraPhong = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTraPhong);;
        this.tienDichVu = tienDichVu;
    }

    public void tinh(){
        long timeDiff = Math.abs(ngayTraPhong.getTime() - ngayNhanPhong.getTime());

        soNgay = timeDiff / (1000 * 60 * 60* 24) + 1;

        String soTang = String.valueOf(soPhong.charAt(0));

        if (soTang.equals("1")){
            donGia = 25;
        } else if (soTang.equals("2")){
            donGia = 34;
        } else if (soTang.equals("3")) {
            donGia = 50;
        } else if (soTang.equals("4")) {
            donGia = 80;
        }

        tongTien = (int) (donGia*soNgay + tienDichVu);
    }

    public int compareTo(KhachHang khachHang){
        return - (this.tongTien - khachHang.tongTien);
    }

    @Override
    public String toString(){
        return maKH + " " + tenKH + " " + soPhong + " " + soNgay + " " + tongTien;
    }
}
