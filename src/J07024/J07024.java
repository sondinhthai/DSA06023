package J07024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class J07024 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        TreeSet<String> treeSet1 = new TreeSet<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\DSA06023\\src\\J07024\\DATA1.in"))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] word = line.split(" ");
                for (int i =0;i< word.length;i++){
                    treeSet.add(word[i].toLowerCase());
                }
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\DSA06023\\src\\J07024\\DATA2.in"))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] word = line.split(" ");
                for (int i =0;i< word.length;i++){
                    treeSet1.add(word[i].toLowerCase());
                }
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        treeSet.retainAll(treeSet1);

        for (String string : treeSet){

        }

        for (String item : treeSet){
            System.out.println(item);
        }
    }
}
