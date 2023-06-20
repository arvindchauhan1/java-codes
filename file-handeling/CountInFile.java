import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountInFile {
    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;

        try {
            File file = new File("./file2.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineCount++;

                // Split the line into words using whitespace as delimiter
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
    }
}
