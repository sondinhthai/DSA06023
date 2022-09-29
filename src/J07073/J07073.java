package J07073;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class J07073 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        List<MonHoc> list = new ArrayList<>();
        String file = "MONHOC.in";
        try {
            Stream<String> stream = Files.lines(Paths.get(file));
            stream.forEach(lines -> {
                arr.add(lines);
            });
            int soMH = Integer.parseInt(arr.get(0));
            int dem = 1;
            for (int i = 0; i < soMH; i++) {
                MonHoc mh = new MonHoc(arr.get(dem), arr.get(++dem), Integer.parseInt(arr.get(++dem)), arr.get(++dem), arr.get(++dem));
                dem++;
                if (mh.getTh().compareTo("Truc tiep") != 0) {
                    list.add(mh);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                String m1 = o1.ma.substring(0, 2);
                String m2 = o2.ma.substring(0, 2);
                return o1.ma.compareTo(o2.ma);
            }
        });
        for (MonHoc mh : list) {
            System.out.println(mh);
        }
    }
}

class MonHoc{
    String ma;
    private String ten;
    private String lt;
    private String th;
    private int stc;

    public MonHoc(String ma, String ten, int stc, String lt, String th) {
        this.ma = ma;
        this.ten = ten;
        this.lt = lt;
        this.th = th;
        this.stc = stc;
    }

    public String getTh() {
        return th;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + stc + " " + lt + " " + th;
    }
}
