package J05021;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J05021{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();
        while (scanner.hasNextLine()){
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
                return o1.compareTo(o2);
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

    public int compareTo(SinhVien sinhVien){
        return this.maSV.compareTo(sinhVien.maSV);
    }

    @Override
    public String toString(){
        return maSV + " " + hoTen + " " + lop + " " + email;
    }
}
