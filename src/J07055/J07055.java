package J07055;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class J07055 {
    private static String chuanhoa(String s) {
        String word = "";
        s = s.trim();
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        for (String i : words) {
            word += String.valueOf(i.charAt(0)).toUpperCase();
            word += i.substring(1);
            word += " ";
        }
        word = word.trim();
        return word;
    }
    public static void main(String[] args) throws IOException {
        String file = "BANGDIEM.in";
        List<String> arr = new ArrayList<>();
        List<BangDiem> list = new ArrayList<>();
        Stream<String> stream = Files.lines(Paths.get(file));
        stream.forEach(lines -> {
            arr.add(lines);
        });
        int soSV = Integer.parseInt(arr.get(0));
        String ma = "";
        int dem = 1;
        for (int i = 1; i <= soSV; i++) {
            if (i < 10) {
                ma = "SV0" + i;
            } else {
                ma = "SV" + i;
            }
            BangDiem bd = new BangDiem(ma, chuanhoa(arr.get(dem)), Integer.parseInt(arr.get(++dem)), Integer.parseInt(arr.get(++dem)), Integer.parseInt(arr.get(++dem)));
            dem++;
            list.add(bd);
        }
        Collections.sort(list, new Comparator<BangDiem>() {
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                return Double.compare(Double.parseDouble(o2.diemTB()), Double.parseDouble(o1.diemTB()));
            }
        });

        for (BangDiem bd : list) {
            if (Double.parseDouble(bd.diemTB()) >= 8) {
                System.out.println(bd + " " + "GIOI");
            } else if (Double.parseDouble(bd.diemTB()) >= 6.5 && Double.parseDouble(bd.diemTB()) < 8) {
                System.out.println(bd + " " + "KHA");
            } else if (Double.parseDouble(bd.diemTB()) >= 5 && Double.parseDouble(bd.diemTB()) < 6.5) {
                System.out.println(bd + " " + "TRUNG BINH");
            } else if (Double.parseDouble(bd.diemTB()) < 5) {
                System.out.println(bd + " " + "KEM");
            }
        }
    }
}

class BangDiem{
    private String ma, ten;
    private int m1, m2, m3;
    private DecimalFormat df = new DecimalFormat("#.##");

    public BangDiem(String ma, String ten, int m1, int m2, int m3) {
        this.ma = ma;
        this.ten = ten;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String diemTB() {
        double diem = (m1 * 0.25 + m2 * 0.35 + m3 * 0.4);
        return String.format("%.2f", diem);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + diemTB();
    }
}
