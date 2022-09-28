package J07022;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class J07022 {
    public static void main(String args[]) throws FileNotFoundException {

        long total = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\DSA06023\\src\\J07022\\DATA.in"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                line = line.replaceAll("[^A-Z,-\\.]", ",");
                String[] number = line.split(",");
                for (int i = 0; i < number.length; i++) {
                    try {
                        total += Integer.parseInt(number[i]);
                    } catch (NumberFormatException e) {
                    }
                }
                line = bufferedReader.readLine();
                System.out.print(line + " ");
            }
            System.out.print(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
