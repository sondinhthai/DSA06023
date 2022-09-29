package J07059;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class J07059 {
    public static void main(String[] args) throws IOException, ParseException {
        List<String> arr = new ArrayList<>();
        List<CaThi> listCT = new ArrayList<>();
        String file = "CATHI.in";
        Stream<String> stream = Files.lines(Paths.get(file));
        stream.forEach(lines -> {
            arr.add(lines);
        });
        int soCT = Integer.parseInt(arr.get(0));
        int dem = 1;
        String ma = "";
        for (int i = 1; i <= soCT; i++) {
            if (i < 10) {
                ma = "C00" + i;
            } else if (i >= 10 && i <= 99) {
                ma = "C0" + i;
            } else {
                ma = "C" + i;
            }
            CaThi ct = new CaThi(ma, arr.get(dem), arr.get(++dem), arr.get(++dem));
            dem++;
            listCT.add(ct);
        }
        Collections.sort(listCT, new Comparator<CaThi>() {
            @Override
            public int compare(CaThi o1, CaThi o2) {
                return o1.gio.compareTo(o2.gio);
            }
        });
        Collections.sort(listCT, new Comparator<CaThi>() {
            @Override
            public int compare(CaThi o1, CaThi o2) {
                return o1.ngay.compareTo(o2.ngay);
            }
        });
        for (CaThi ct : listCT) {
            System.out.println(ct);
        }
    }
}

class CaThi{
    private String ma, phong;
    Date ngay;
    Date gio;

    public CaThi(String ma, String ngay, String gio, String phong) throws ParseException {
        this.ma = ma;
        this.phong = phong;
        this.ngay = new SimpleDateFormat("dd/MM/yyyy").parse(ngay);
        this.gio = new SimpleDateFormat("hh:mm").parse(gio);
    }

    @Override
    public String toString() {
        return ma + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngay) + " " + new SimpleDateFormat("HH:mm").format(gio) + " " + phong;
    }
}
