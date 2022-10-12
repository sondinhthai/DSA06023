package J07007;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

public class J07007 {
    public static void main(String args[]) throws FileNotFoundException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("VANBAN.in"))) {
            String line = bufferedReader.readLine();
            TreeSet<String> treeSet = new TreeSet<>();
            while (line != null) {
                String[] word = line.split(" ");
                for (int i =0;i< word.length;i++){
                    treeSet.add(word[i].toLowerCase());
                }
                line = bufferedReader.readLine();
            }

            for (String item : treeSet){
                System.out.println(item);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

