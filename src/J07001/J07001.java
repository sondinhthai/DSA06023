package J07001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class J07001 {
    public static void main(String args[]) throws FileNotFoundException {

        String url = "C:\\Users\\Admin\\IdeaProjects\\DSA06023\\src\\J07001\\VANBAN.in";

        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);

        try {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
