import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SapXepDanhSachGV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<GiangVien> list = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            String hoTen = scanner.nextLine();
            String boMon = scanner.nextLine();

            GiangVien sv = new GiangVien("GV" + String.format("%02d", i), hoTen, boMon);
            sv.ChuanHoaBoMon();
            list.add(sv);
        }

        list.sort(new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                return o1.compareTo(o2);
            }
        });

        for (GiangVien sv: list) {
            System.out.println(sv);
        }
    }
}

class GiangVien{
    private String maGV;
    private String hoTen;
    private String boMon;

    public GiangVien(String maGV, String hoTen, String boMon) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.boMon = boMon;
    }

    public void ChuanHoaBoMon(){
        String[] item = boMon.split(" ");
        boMon = "";
        for (int i=0;i< item.length;i++){
            boMon += String.valueOf(item[i].charAt(0)).toUpperCase();
        }
    }

    public int compareTo(GiangVien giangVien) {
        String[] item1 = this.hoTen.split(" ");
        String[] item2 = giangVien.hoTen.split(" ");

        String ten1 = item1[item1.length-1];
        String ten2 = item2[item2.length-1];

        if (ten1.equals(ten2)) return compareToMSV(giangVien);
        return ten1.compareTo(ten2);
    }

    public int compareToMSV(GiangVien giangVien) {
        return this.maGV.compareTo(giangVien.maGV);
    }

    @Override
    public String toString(){
        return maGV + " " + hoTen + " " + boMon;
    }
}
