package J05079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Lop> list = new ArrayList<>();
        while (n-- > 0) {
            Lop lop = new Lop(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(lop);
        }
        Collections.sort(list);
        ;

        int so = Integer.parseInt(sc.nextLine());
        String[] temp = new String[so];
        for (int i = 0; i < so; i++) {
            temp[i] = sc.nextLine();
        }

        for (int i = 0; i < so; i++) {
            String ten = "";
            ArrayList<String> result = new ArrayList<>();

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).getMa().equals(temp[i])) {
                    String temppp = list.get(j).getNhom() + " " + list.get(j).getTengv();
                    result.add(temppp);
                    ten = list.get(j).getTenmh();
                }
            }
            System.out.println("Danh sach nhom lop mon " + ten + ":");
            for (String sss : result) {
                System.out.println(sss);
            }
        }
    }
}

class Lop implements Comparable<Lop> {
    private String ma;
    private String tenmh;
    private String nhom;
    private String tengv;

    public Lop(String ma, String tenmh, String nhom, String tengv) {
        this.ma = ma;
        this.tenmh = tenmh;
        this.nhom = nhom;
        this.tengv = tengv;
    }

    public String getTenmh() {
        return tenmh;
    }

    public String getNhom() {
        return nhom;
    }

    public String getTengv() {
        return tengv;
    }

    @Override
    public int compareTo(Lop o) {
        return this.nhom.compareTo(o.nhom);
    }

    public String getMa() {
        return ma;
    }
}