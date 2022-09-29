package J07071;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07071 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DANHSACH.in"));
        int n = in.nextInt();
        in.nextLine();
        List<Ten> listTen = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            Ten ten = new Ten(s);
            listTen.add(ten);
        }
        Collections.sort(listTen);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            in.nextLine();
            String s2 = in.next();
            for (Ten listTen1 : listTen) {
                if (listTen1.sosanh(s2)) {
                    System.out.println(listTen1);
                }
            }
        }
    }
}

class Ten implements Comparable<Ten>{
    private String tat;
    private String full;
    private String ho;
    private String ten;

    public Ten(String full) {
        this.full = full;
        this.tat = rutGon(full).replace(" ", ".");
        String[] s = full.trim().split(" ");
        this.ho = s[0];
        this.ten = s[s.length - 1];
    }

    private String rutGon(String full) {
        StringBuilder sbd = new StringBuilder();
        StringTokenizer stk = new StringTokenizer(full.trim());
        while (stk.hasMoreTokens()) {
            String tu = stk.nextToken();
            sbd.append(Character.toUpperCase(tu.charAt(0)) + " ");
        }
        return sbd.toString().trim();
    }

    @Override
    public String toString() {
        return full;
    }

    public boolean sosanh(String s){
        if (s.length() != this.tat.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (tat.charAt(i) != s.charAt(i)) {
                if (s.charAt(i) == '*') {
                    continue;
                }else return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Ten o) {
        if (this.ten.compareTo(o.ten) != 0) {
            return this.ten.compareTo(o.ten);
        }
        return this.ho.compareTo(o.ho);
    }

}
