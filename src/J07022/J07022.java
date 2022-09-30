package J07022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class J07022 {
    public static void main(String args[]) throws FileNotFoundException {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        long total = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\DSA06023\\src\\J07022\\DATA.in"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] item = line.split(" ");
                list1.addAll(Arrays.asList(item));

                line = line.replaceAll("[^0-9,-\\.]", ",");
                String[] number = line.split(",");
                for (int i = 0; i < number.length; i++) {
                    try {
                        list2.add(number[i]);
                    } catch (NumberFormatException e) {
                    }
                }

                line = bufferedReader.readLine();
            }

            for (String i : list2){
                list1.remove(i);
            }

            Collections.sort(list1);

            for (String res : list1){
                System.out.print(res + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
