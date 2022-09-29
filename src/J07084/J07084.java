package J07084;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class J07084 {
    public static void main(String[] args) throws IOException, ParseException {
        List<String> arr = new ArrayList<>();
        List<Online> listO = new ArrayList<>();
        String file = "ONLINE.in";
        Stream<String> stream = Files.lines(Paths.get(file));
        stream.forEach(lines -> {
            arr.add(lines);
        });
        int so = Integer.parseInt(arr.get(0));
        int dem = 1;
        for (int i = 0; i < so; i++) {
            Online o = new Online(arr.get(dem), arr.get(++dem), arr.get(++dem));
            dem++;
            listO.add(o);
        }
        Collections.sort(listO, new Comparator<Online>() {
            @Override
            public int compare(Online o1, Online o2) {
                return (int) (o2.time() - o1.time());
            }
        });
        for (Online o : listO) {
            System.out.println(o);
        }
    }
}

class Online{
    private String ten;
    private Date bd, kt;

    public Online(String ten, String bd, String kt) throws ParseException {
        this.ten = ten;
        this.bd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(bd);
        this.kt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(kt);
    }

    public long time() {
        long diff = this.kt.getTime() - this.bd.getTime();
        return diff / 60000;
    }

    @Override
    public String toString() {
        return ten + " " + time();
    }
}
