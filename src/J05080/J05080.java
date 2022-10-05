package J05080;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05080 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        ArrayList<Lop> list = new ArrayList<>();
        while(n-- >0){
            Lop lop = new Lop(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
            list.add(lop);
        }
        Collections.sort(list);
        int  number = Integer.parseInt(in.nextLine());
        String[] temp = new String[number];
        for(int i=0;i<number;i++){
            temp[i] = in.nextLine();
        }

        for(int i=0;i<number;i++){
            String name="";
            ArrayList<String> result = new ArrayList<>() ;
            for(int j=0;j<list.size();j++){
                if(list.get(j).getTengv().equals(temp[i])){
                    String temppp =list.get(j).getMa()+" "+list.get(j).getTen()+" "+list.get(j).getNhom();
                    result.add(temppp);
                    name = list.get(j).getTengv();
                }
            }
            System.out.println("Danh sach cho giang vien "+name+":");
            for(String sss:result){
                System.out.println(sss);
            }
        }
    }
}
class Lop implements Comparable<Lop>{
    private String ma ,ten  ,tengv ;
    private String nhom ;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }



    public Lop(String ma, String ten, String nhom ,String tengv) {
        this.ma = ma;
        this.ten = ten;
        this.tengv = tengv;
        this.nhom = nhom;
    }


    @Override
    public int compareTo(Lop o) {
        if(this.ma.compareTo(o.ma) > 0){
            return 1;
        }else{
            if(this.ma.compareTo(o.ma) <0){
                return -1 ;
            }else{
                return this.nhom.compareTo(o.nhom) ;
            }
        }

    }
}