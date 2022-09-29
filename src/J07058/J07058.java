package J07058;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class J07058 {
    public static void main(String[] args) throws IOException {
        List<String> arr = new ArrayList<>();
        List<MonHoc> list = new ArrayList<>();
        String file = "MONHOC.in";
        Stream<String> stream = Files.lines(Paths.get(file));
        stream.forEach(lines -> {
            arr.add(lines);
        });
        int soMH = Integer.parseInt(arr.get(0));
        int dem = 1;
        for (int i = 1; i <= soMH; i++) {
            MonHoc mh = new MonHoc(arr.get(dem), arr.get(++dem), arr.get(++dem));
            dem++;
            list.add(mh);
        }
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
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
    private String hinhthuc;

    public MonHoc(String ma, String ten, String hinhthuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthuc = hinhthuc;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + hinhthuc;
    }
}
