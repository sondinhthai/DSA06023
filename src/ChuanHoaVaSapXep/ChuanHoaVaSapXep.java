package ChuanHoaVaSapXep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ChuanHoaVaSapXep {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("DANHSACH.in"))) {
            String line = bufferedReader.readLine();
            List<Name> list = new ArrayList<>();
            while (line != null) {
                Name name = new Name(line);
                name.chuanHoaTen();
                list.add(name);
                line = bufferedReader.readLine();
            }

            list.sort(new Comparator<Name>() {
                @Override
                public int compare(Name o1, Name o2) {
                    return o1.compareTo(o2);
                }
            });

            for (Name name: list) {
                System.out.println(name);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Name{
    private String hoTen;

    public Name(String hoTen) {
        this.hoTen = hoTen;
    }

    public void chuanHoaTen(){
        hoTen = hoTen.trim().toLowerCase();
        hoTen = hoTen.replaceAll("\\s+", " ");
        String[] temp = hoTen.split(" ");
        hoTen = "";
        for (int i = 0; i < temp.length; i++) {
            hoTen += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                hoTen += " ";
        }
    }

    public int compareTo(Name name) {
        String[] item1 = this.hoTen.split(" ");
        String[] item2 = name.hoTen.split(" ");

        String ten1 = item1[item1.length-1];
        String ten2 = item2[item2.length-1];

        if (ten1.equals(ten2)) return compareToHo(name);
        return ten1.compareTo(ten2);
    }

    public int compareToHo(Name name) {
        String[] item1 = this.hoTen.split(" ");
        String[] item2 = name.hoTen.split(" ");

        String ho1 = item1[0];
        String ho2 = item2[0];

        if (ho1.equals(ho2)) return compareToDem(name);
        return ho1.compareTo(ho2);
    }

    public int compareToDem(Name name) {
        String[] item1 = this.hoTen.split(" ");
        String[] item2 = name.hoTen.split(" ");

        String s1 = " ", s2 = " ";
        for (int i =1;i<=item1.length-2;i++){
            s1 += item1[i];
        }

        for (int i =1;i<=item2.length-2;i++){
            s2 += item2[i];
        }

        return s1.compareTo(s2);
    }

    @Override
    public String toString(){
        return hoTen;
    }
}
