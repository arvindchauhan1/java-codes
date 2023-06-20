import java.io.File;
import java.io.IOException;

public class FileMethodsExample {
    public static void main(String[] args) {
        // Creating a new File object
        File file = new File("file1.txt");

        // Checking if the file exists
        boolean exists = file.exists();
        System.out.println("File exists: " + exists);

        // Getting the absolute path of the file
        String absolutePath = file.getAbsolutePath();
        System.out.println("Absolute path: " + absolutePath);

        // Checking if the file is a directory
        boolean isDirectory = file.isDirectory();
        System.out.println("Is directory: " + isDirectory);

        // Creating a new directory
        File directory = new File("new_directory");
        boolean created = directory.mkdir();
        System.out.println("Directory created: " + created);

        // Renaming the file
        File newFile = new File("new_example.txt");
        boolean renamed = file.renameTo(newFile);
        System.out.println("File renamed: " + renamed);

        // Deleting the file
        boolean deleted = newFile.delete();
        System.out.println("File deleted: " + deleted);

        // Creating a new file
        try {
            boolean newFileCreated = newFile.createNewFile();
            System.out.println("New file created: " + newFileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
