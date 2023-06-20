import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    public static void readFromFile(String fileName) throws FileNotFoundException, IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            // Read data from the file
            // ...
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            readFromFile("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
    }
}
