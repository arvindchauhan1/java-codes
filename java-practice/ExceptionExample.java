import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Opening a file that does not exist
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            // FileNotFoundException is thrown when the file is not found
            System.out.println("File not found: " + e.getMessage());
        }

        try {
            // Dividing by zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // ArithmeticException is thrown when dividing by zero
            System.out.println("Arithmetic error: " + e.getMessage());
        }

        try {
            // Accessing an array element out of bounds
            int[] numbers = { 1, 2, 3 };
            int value = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            // ArrayIndexOutOfBoundsException is thrown when accessing an invalid array
            // index
            System.out.println("Array index out of bounds: " + e.getMessage());
        }

        try {
            // Parsing an invalid integer from a string
            String str = "abc";
            int number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            // NumberFormatException is thrown when the string cannot be parsed into an
            // integer
            System.out.println("Number format error: " + e.getMessage());
        }

        try {
            // Attempting to access a null object reference
            String text = null;
            int length = text.length();
        } catch (NullPointerException e) {
            // NullPointerException is thrown when trying to access a null object reference
            System.out.println("Null pointer exception: " + e.getMessage());
        }

        try {
            // Accessing a character beyond the string's length
            String str = "Hello";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            // StringIndexOutOfBoundsException is thrown when accessing an invalid index of
            // a string
            System.out.println("String index out of bounds: " + e.getMessage());
        }

        try {
            // Custom exception of your choice
            throw new CustomException("Custom exception occurred");
        } catch (CustomException e) {
            // CustomException is a user-defined exception
            System.out.println("Custom exception: " + e.getMessage());
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
