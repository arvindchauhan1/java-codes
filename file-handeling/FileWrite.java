import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            File myFile = new File("./file2.txt");

            // creating file
            if (myFile.createNewFile())
                System.out.println("file created");
            else
                System.out.println("file already exist");

            FileWriter fw = new FileWriter("./file2.txt");

            fw.write("Files in Java might be tricky, but it is fun enough!\n");
            fw.append("Files in Java might be tricky, but it is fun enough!\n");
            fw.append("Files in Java might be tricky, but it is fun enough!\n");
            fw.append("Files in Java might be tricky, but it is fun enough!\n");

            fw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
