package J07057;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class J07057 {
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
        List<String> arr = new ArrayList<>();
        List<ThiSinh> listTS = new ArrayList<>();
        String file = "THISINH.in";
        Stream<String> stream = Files.lines(Paths.get(file));
        stream.forEach(lines -> {
            arr.add(lines);
        });
        int soSV = Integer.parseInt(arr.get(0));
        int dem = 1;
        String ma = "";
        for (int i = 1; i <= soSV; i++) {
            if (i < 10) {
                ma = "TS0" + i;
            } else {
                ma = "TS" + i;
            }
            ThiSinh ts = new ThiSinh(ma, chuanhoa(arr.get(dem)), Float.parseFloat(arr.get(++dem)), arr.get(++dem), Integer.parseInt(arr.get(++dem)));
            dem++;
            listTS.add(ts);
        }

        Collections.sort(listTS, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                return Double.compare(Double.parseDouble(o2.kq()), Double.parseDouble(o1.kq()));
            }
        });
        for (ThiSinh ts : listTS) {
            System.out.print(ts);
            if (Double.parseDouble(ts.kq()) >= 20.5) {
                System.out.println(" Do");
            } else {
                System.out.println(" Truot");
            }
        }
    }
}

class ThiSinh{
    private String ma, ten, dt;
    private float diem;
    private int kv;

    public ThiSinh(String ma, String ten, float diem, String dt, int kv) {
        this.ma = ma;
        this.ten = ten;
        this.dt = dt;
        this.diem = diem;
        this.kv = kv;
    }

    public String kq() {
        double d = this.diem;
        if (this.kv == 1) {
            d += 1.5;
        } else if (this.kv == 2) {
            d += 1;
        } else if (this.kv == 3) {
            d += 0;
        }
        if (this.dt.compareTo("Kinh") == 0) {
            d += 0;
        } else {
            d += 1.5;
        }
        return String.format("%.1f", d);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + kq();
    }
}
