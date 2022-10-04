package TN02012;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class TN02012 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<t;i++)
            map.put(sc.next(),sc.nextLine());
        t= Integer.parseInt(sc.nextLine());
        for(int i=0;i<t;i++){
            System.out.println(new NhanVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),Long.parseLong(
                    sc.nextLine()),map));
        }
    }
}
class NhanVien {
    private String ma,ten,phongBan;
    private Long luongCoBan,ngayCong,luongThang;

    public NhanVien(String ma, String ten, Long luongCoBan, Long ngayCong, HashMap<String,String> phong) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
        this.ngayCong = ngayCong;
        phongBan=phong.get(ma.substring(3,5));
        int numKimNghiem=Integer.parseInt(ma.substring(1,3));
        switch (ma.charAt(0)){
            case 'A':
                if(numKimNghiem<4){
                    luongThang=luongCoBan*ngayCong*10;
                }
                else if(numKimNghiem<9){
                    luongThang=luongCoBan*ngayCong*12;
                }
                else if(numKimNghiem<16){
                    luongThang=luongCoBan*ngayCong*14;
                }
                else {
                    luongThang=luongCoBan*ngayCong*20;
                }
                break;
            case 'B':
                if(numKimNghiem<4){
                    luongThang=luongCoBan*ngayCong*10;
                }
                else if(numKimNghiem<9){
                    luongThang=luongCoBan*ngayCong*11;
                }
                else if(numKimNghiem<16){
                    luongThang=luongCoBan*ngayCong*13;
                }
                else {
                    luongThang=luongCoBan*ngayCong*16;
                }
                break;
            case 'C':
                if(numKimNghiem<4){
                    luongThang=luongCoBan*ngayCong*9;
                }
                else if(numKimNghiem<9){
                    luongThang=luongCoBan*ngayCong*10;
                }
                else if(numKimNghiem<16){
                    luongThang=luongCoBan*ngayCong*12;
                }
                else {
                    luongThang=luongCoBan*ngayCong*14;
                }
                break;
            case 'D':
                if(numKimNghiem<4){
                    luongThang=luongCoBan*ngayCong*8;
                }
                else if(numKimNghiem<9){
                    luongThang=luongCoBan*ngayCong*9;
                }
                else if(numKimNghiem<16){
                    luongThang=luongCoBan*ngayCong*11;
                }
                else {
                    luongThang=luongCoBan*ngayCong*13;
                }
                break;
            default: break;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s%s %d000",ma,ten,phongBan,luongThang);
    }
}