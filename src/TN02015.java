import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class TN02015 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        WordSet ws = new WordSet(input);
        System.out.println(ws);
    }
}

class WordSet{
    private TreeSet<String> vals;
    public WordSet(Scanner sc){
        this.vals = new TreeSet<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            StringTokenizer t= new StringTokenizer(s);
            while(t.hasMoreTokens()){

                this.vals.add(t.nextToken().toLowerCase());
            }
        }
    }

    @Override
    public String toString() {
        String res ="";
        for (String i : this.vals){
            res += i+"\n";
        }
        return res.trim();
    }
}