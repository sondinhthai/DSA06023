package J07014;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07014 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
class WordSet {
    public Scanner scanner;

    public TreeSet<String> treeSet = new TreeSet<>();

    public WordSet(String path) throws FileNotFoundException {
        this.scanner = new Scanner(new File(path));
        while(scanner.hasNext()) {
            String input = scanner.next().toLowerCase();
            if(input.length() > 0) {
                treeSet.add(input);
            }
        }
    }

    public String union(WordSet wordSet) {
        TreeSet<String> r = new TreeSet<>();
        r.addAll(wordSet.treeSet);
        r.addAll(this.treeSet);
        Object[] as = r.toArray();
        StringBuilder s = new StringBuilder();
        for (Object a : as) {
            s.append(a).append(" ");
        }
        return s.toString().trim();
    }

    public String intersection(WordSet wordSet) {
        TreeSet<String> r = new TreeSet<>();
        r.addAll(wordSet.treeSet);
        r.retainAll(this.treeSet);
        Object[] as = r.toArray();
        StringBuilder s = new StringBuilder();
        for (Object a : as) {
            s.append(a).append(" ");
        }
        return s.toString().trim();
    }
}