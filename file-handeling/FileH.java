import java.io.File;

public class FileH {
    public static void main(String[] args) {
        try {
            File myFile = new File("./file1.txt");
            myFile.createNewFile();

            System.out.println("canRead() = " + myFile.canRead());
            System.out.println("canWrite() = " + myFile.canWrite());

            // deleting file
            myFile.delete();
            System.out.println("file deleted");

            // Tests whether the file exists

            System.out.println("exist() = " + myFile.exists());

            myFile.createNewFile();
            System.out.println("new file created");

            System.out.println("getName() = " + myFile.getName());

            System.out.println("getAbsolutePath() = " + myFile.getAbsolutePath());

            System.out.println("length() = " + myFile.length());

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
