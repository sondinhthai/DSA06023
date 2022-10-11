package J07002;

import java.io.*;

public class J07002 {
    public static void main(String args[]) throws FileNotFoundException {

        long total = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("DATA.in"))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                line = line.replaceAll("[^0-9,-\\.]", ",");
                String[] number = line.split(",");
                for (int i = 0; i < number.length; i++) {
                    try {
                        total += Integer.parseInt(number[i]);
                    } catch (NumberFormatException e) {
                    }
                }
                line = bufferedReader.readLine();
            }
            System.out.print(total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
