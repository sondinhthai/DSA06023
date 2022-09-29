//package J07024;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.TreeSet;
//
//public class J07024 {
//    public static void main(String[] args) {
//        TreeSet<String> treeSet = new TreeSet<>();
//        TreeSet<String> treeSet1 = new TreeSet<>();
//
//        TreeSet<String> treeSet2 = new TreeSet<>();
//        TreeSet<String> treeSet3 = new TreeSet<>();
//
//        List<String> list = new ArrayList<>();
//        List<String> list1 = new ArrayList<>();
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\DSA06023\\src\\J07024\\DATA1.in"))) {
//            String line = bufferedReader.readLine();
//
//            while (line != null) {
//                String[] word = line.split(" ");
//                for (int i =0;i< word.length;i++){
//                    treeSet.add(word[i].toLowerCase());
//                    treeSet2.add(word[i].toLowerCase());
//                }
//
//                line = bufferedReader.readLine();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\DSA06023\\src\\J07024\\DATA2.in"))) {
//            String line = bufferedReader.readLine();
//
//            while (line != null) {
//                String[] word = line.split(" ");
//                for (int i =0;i< word.length;i++){
//                    treeSet1.add(word[i].toLowerCase());
//                    treeSet3.add(word[i].toLowerCase());
//                }
//
//                line = bufferedReader.readLine();
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        list.addAll(treeSet);
//        list1.addAll(treeSet3);
//
//        treeSet.retainAll(treeSet1);
//
//        treeSet3.retainAll(treeSet2);
//
//        for (String del : treeSet){
//            list.remove(del);
//        }
//
//        for (String del : treeSet3){
//            list1.remove(del);
//        }
//
//        for (String item : list){
//            System.out.print(item + " ");
//        }
//
//        System.out.println();
//
//        for (String item : list1){
//            System.out.print(item + " ");
//        }
//    }
//}
//
//class WordSet{
//    private String file;
//
//    public WordSet(String file) {
//        this.file = file;
//    }
//
//    public
//}
