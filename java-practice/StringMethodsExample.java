public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        int length = str.length();
        System.out.println("Length: " + length); // Output: Length: 13

        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex); // Output: Character at index 7: W

        String substring1 = str.substring(7);
        System.out.println("Substring 1: " + substring1); // Output: Substring 1: World!

        String substring2 = str.substring(7, 12);
        System.out.println("Substring 2: " + substring2); // Output: Substring 2: World

        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase); // Output: Uppercase: HELLO, WORLD!

        String lowercase = str.toLowerCase();
        System.out.println("Lowercase: " + lowercase); // Output: Lowercase: hello, world!

        String replaced = str.replace('o', 'a');
        System.out.println("Replaced: " + replaced); // Output: Replaced: Hella, Warld!

        int indexOf = str.indexOf('o');
        System.out.println("Index of 'o': " + indexOf); // Output: Index of 'o': 4

        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains); // Output: Contains 'World': true

        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith); // Output: Starts with 'Hello': true

        boolean endsWith = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWith); // Output: Ends with '!': true
    }
}
