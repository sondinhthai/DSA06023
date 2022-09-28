import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSetJ04022 s1 = new WordSetJ04022(in.nextLine());
        WordSetJ04022 s2 = new WordSetJ04022(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
 class WordSetJ04022{
     private TreeSet<String> vals;
     public WordSetJ04022(String s){
         this.vals = new TreeSet<>();
         StringTokenizer t= new StringTokenizer(s);
         while(t.hasMoreTokens()){

             this.vals.add(t.nextToken().toLowerCase());
         }
     }

     public WordSetJ04022(TreeSet<String> vals) {
         this.vals = vals;
     }

     public WordSetJ04022 union(WordSetJ04022 o){
         TreeSet<String> rs = (TreeSet<String>) this.vals.clone();
         rs.addAll(o.vals);

         return new WordSetJ04022(rs);
     }
     public WordSetJ04022 intersection(WordSetJ04022 o){
         TreeSet<String> rs = (TreeSet<String>) this.vals.clone();
         rs.retainAll(o.vals);

         return new WordSetJ04022(rs);
     }
     @Override
     public String toString() {
         String res ="";
         for (String i : this.vals){
             res += i+" ";
         }
         return res.trim();
     }
 }

