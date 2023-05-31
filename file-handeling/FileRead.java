import java.io.File;
import java.util.Scanner;;

public class FileRead {
    public static void main(String[] args) {
        try {
            File myFile = new File("./file2.txt");
            Scanner sc = new Scanner(myFile);

            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
