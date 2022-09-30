package J05020;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J05020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(scanner.nextLine());
        while (t-->0){
            String maSV = scanner.nextLine();
            String tenSV = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();

            SinhVien sinhVien = new SinhVien(maSV, tenSV, lop, email);

            list.add(sinhVien);
        }

        list.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.compareToLop(o2);
            }
        });

        for (SinhVien sinhVien : list){
            System.out.println(sinhVien);
        }
    }
}

class SinhVien{
    private String maSV;
    private String hoTen;
    private String lop;
    private String email;

    public SinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public int compareToLop(SinhVien sinhVien){
        if (this.lop.equals(sinhVien.lop)){
            return compareToMa(sinhVien);
        }
        return this.lop.compareTo(sinhVien.lop);
    }

    public int compareToMa(SinhVien sinhVien){
        return this.maSV.compareTo(sinhVien.maSV);
    }

    @Override
    public String toString(){
        return maSV + " " + hoTen + " " + lop + " " + email;
    }
}
