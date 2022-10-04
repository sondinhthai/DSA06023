package J05058;

import java.text.DecimalFormat;
import java.util.*;

public class J05058 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<ThiSinh> list=new ArrayList<>();
        for(int i=0;i<t;i++){
            list.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())*2.0
                    ,Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for(ThiSinh thiSinh:list)
            System.out.println(thiSinh);
    }
}
class ThiSinh implements Comparable<ThiSinh>{
    private String ma,ten,trangThai,khuVuc;
    private double toan,ly,hoa,cong,tongDiem;
    private DecimalFormat decimalFormat=new DecimalFormat("#.#");

    public ThiSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        khuVuc=ma.substring(0,3);
        switch (khuVuc){
            case "KV1": cong=0.5;break;
            case "KV2": cong=1.0;break;
            default: cong=2.5;break;
        }
        tongDiem=Math.round((toan+ly+hoa+cong)*10.0)/10.0;
        if(tongDiem>=24.0) trangThai="TRUNG TUYEN";
        else trangThai="TRUOT";
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s",ma,ten,decimalFormat.format(cong),decimalFormat.format(tongDiem),trangThai);
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(tongDiem==o.tongDiem){
            return ma.compareTo(o.ma);
        }
        return tongDiem>o.tongDiem?-1:1;
    }
}
