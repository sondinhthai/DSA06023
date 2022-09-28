import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SapXepDanhSachSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<SV> list = new ArrayList<>();
        while (n-->0){
            String maSV = scanner.nextLine();
            String hoTen = scanner.nextLine();
            String sdt = scanner.nextLine();
            String email = scanner.nextLine();

            SV sv = new SV(maSV, hoTen, sdt, email);
            list.add(sv);
        }

        list.sort(new Comparator<SV>() {
            @Override
            public int compare(SV o1, SV o2) {
                return o1.compareTo(o2);
            }
        });

        for (SV sv: list) {
            System.out.println(sv);
        }
    }
}

class SV{
    private String maSV;
    private String hoTen;
    private String sdt;
    private String email;

    public SV(String maSV, String hoTen, String sdt, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }

    public int compareTo(SV sv) {
        String[] item1 = this.hoTen.split(" ");
        String[] item2 = sv.hoTen.split(" ");

        String ten1 = item1[item1.length-1];
        String ten2 = item2[item2.length-1];

        if (ten1.equals(ten2)) return compareToHo(sv);
        return ten1.compareTo(ten2);
    }

    public int compareToHo(SV sv) {
        String[] item1 = this.hoTen.split(" ");
        String[] item2 = sv.hoTen.split(" ");

        String ho1 = item1[0];
        String ho2 = item2[0];

        if (ho1.equals(ho2)) return compareToDem(sv);
        return ho1.compareTo(ho2);
    }

    public int compareToDem(SV sv) {
        String[] item1 = this.hoTen.split(" ");
        String[] item2 = sv.hoTen.split(" ");

        String s1 = " ", s2 = " ";
        for (int i =1;i<=item1.length-2;i++){
            s1 += item1[i];
        }

        for (int i =1;i<=item2.length-2;i++){
            s2 += item2[i];
        }

        if (s1.equals(s2)) return compareToMSV(sv);
        return s1.compareTo(s2);
    }

    public int compareToMSV(SV sv) {
        return this.maSV.compareTo(sv.maSV);
    }

    @Override
    public String toString(){
        return maSV + " " + hoTen + " " + sdt + " " + email;
    }
}
