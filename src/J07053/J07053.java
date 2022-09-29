package J07053;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class J07053 {
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

    public static void main(String[] args) throws IOException, ParseException {
        String file = "XETTUYEN.in";
        List<String> arr = new ArrayList<>();
        List<XetTuyen> listTS = new ArrayList<>();
        Stream<String> stream = Files.lines(Paths.get(file));
        stream.forEach(lines -> {
            arr.add(lines);
        });
        int soTS = Integer.parseInt(arr.get(0));
        int dem = 1;
        for (int i = 1; i <= soTS; i++) {
            String ma = "";
            if (i < 10) {
                ma = "PH0" + i;
            } else {
                ma = "PH" + i;
            }
            XetTuyen xt = new XetTuyen(chuanhoa(arr.get(dem)), arr.get(++dem), Double.parseDouble(arr.get(++dem)), Double.parseDouble(arr.get(++dem)));
            xt.setMa(ma);
            listTS.add(xt);
            dem++;
        }
        for (XetTuyen xt : listTS) {
            System.out.print(xt);
            if (xt.diem() == 9 || xt.diem() == 10) {
                System.out.println("Xuat sac");
            } else if (xt.diem() == 8) {
                System.out.println("Gioi");
            } else if (xt.diem() == 7) {
                System.out.println("Kha");
            } else if (xt.diem() >= 5 && xt.diem() <= 6) {
                System.out.println("Trung binh");
            } else {
                System.out.println("Truot");
            }
        }
    }
}

class XetTuyen{
    private String ma, ten;
    private Date ngaySinh;
    private double lt, th;

    public XetTuyen(String ten, String ngaySinh, double lt, double th) throws ParseException {
        this.ten = ten;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.lt = lt;
        this.th = th;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int tuoi() {
        int tuoi = 2021 - 1900 - this.ngaySinh.getYear();
        return tuoi;
    }

    public int diem() {
        if (this.lt >= 8 && this.th >= 8) {
            return (int) Math.round((lt + th) / 2 + 1) > 10 ? 10 : (int) Math.round((lt + th) / 2 + 1);
        } else if (this.lt >= 7.5 && this.th >= 7.5) {
            return (int) Math.round((lt + th) / 2 + 0.5) > 10 ? 10 : (int) Math.round((lt + th) / 2 + 0.5);
        } else {
            return (int) Math.round((lt + th) / 2) > 10 ? 10 : (int) Math.round((lt + th) / 2);
        }
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tuoi() + " " + diem() + " ";
    }
}
