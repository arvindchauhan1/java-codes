import java.lang.Exception;

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {

        try {
            throw new UserException("user exception");
        } catch (Exception e) {
            System.out.println("exception handeled");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
