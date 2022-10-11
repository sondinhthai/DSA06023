package J07025;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07025 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        sc.nextLine();
        List<KhachHang> list = new ArrayList<>();
        while (t-- > 0) {
            list.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(list, (o1, o2) -> {
            String w1[] = o1.getNgaysinh().split("/");
            String w2[] = o2.getNgaysinh().split("/");
            int ss = w1[2].compareTo(w2[2]);

            if(ss!=0) return ss;
            ss = w1[1].compareTo(w2[1]);

            if(ss!=0) return ss;
            ss = w1[0].compareTo(w2[0]);

            return ss;
            // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
        for (KhachHang m : list) {
            System.out.println(m);
        }
    }
}
class KhachHang {
    String ma,ten,gioitinh,ngaysinh,diachi;
    private static int sl=0;
    public KhachHang(String ten, String gioitinh, String ngaysinh, String diachi) {
        this.ten = chuanHoa(ten);
        this.gioitinh = gioitinh;
        this.ngaysinh = formatDate(ngaysinh);
        this.diachi = diachi;
        sl++;
        this.ma = sl+"";
        while(this.ma.length()<3){
            this.ma = "0" +this.ma;
        }
        this.ma = "KH" +this.ma;
    }

    public static String chuanHoa(String s){
        String res ="";
        StringTokenizer tk = new StringTokenizer(s);
        while(tk.hasMoreTokens()){
            String t = tk.nextToken().toLowerCase();
            char d[] = t.toCharArray();
            d[0]=Character.toUpperCase(d[0]);
            res += String.valueOf(d) + " ";
        }
        return res.trim();
    }
    public static String formatDate(String date){
        String[] words = date.split("/");
        String s = "";
        for(String item: words){
            if(item.length() ==1){
                item = "0" + item;
            }
            s += item+"/";
        }

        return s.substring(0, s.length()-1);
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    @Override
    public String toString() {
        return  ma + " " + ten + " " + gioitinh + " " + diachi + " " + ngaysinh  ;
    }
}