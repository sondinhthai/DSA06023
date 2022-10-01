package J05026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<GiangVien> list = new ArrayList<>();

        for (int i=1;i<=t;i++){
            String tenGV = scanner.nextLine();
            String boMon = scanner.nextLine();

            String[] item = boMon.split(" ");

            StringBuilder res = new StringBuilder();

            for (String s : item) {
                res.append(String.valueOf(s.charAt(0)).toUpperCase());
            }

            GiangVien giangVien = new GiangVien("GV" + String.format("%02d", i), tenGV, res.toString());
            list.add(giangVien);
        }

        int q = Integer.parseInt(scanner.nextLine());
        while (q-->0){
            String querry = scanner.nextLine();

            String[] item1 = querry.split(" ");

            StringBuilder res1 = new StringBuilder();

            for (String s : item1) {
                res1.append(String.valueOf(s.charAt(0)).toUpperCase());
            }

            System.out.println("DANH SACH GIANG VIEN BO MON " + res1 + ":");

            for (GiangVien giangVien : list){
                if (giangVien.getBoMon().equals(res1.toString())){
                    System.out.println(giangVien);
                }
            }
        }
    }
}

class GiangVien{
    private String maGV;
    private String tenGV;
    private String boMon;

    public GiangVien(String maGV, String tenGV, String boMon) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.boMon = boMon;
    }
    public String getBoMon() {
        return boMon;
    }

    @Override
    public String toString(){
        return maGV + " " + tenGV + " " + boMon;
    }
}
