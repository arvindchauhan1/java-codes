import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };

        // length: Retrieves the length of the array
        int length = arr.length;
        System.out.println("Length: " + length); // Output: Length: 5

        // clone: Creates a copy of the array
        int[] arrCopy = arr.clone();
        System.out.println("Clone: " + Arrays.toString(arrCopy)); // Output: Clone: [5, 2, 8, 1, 3]

        // toString: Converts the array into a string representation
        String arrString = Arrays.toString(arr);
        System.out.println("ToString: " + arrString); // Output: ToString: [5, 2, 8, 1, 3]

        // sort: Sorts the array elements in ascending order
        Arrays.sort(arr);
        System.out.println("Sort: " + Arrays.toString(arr)); // Output: Sort: [1, 2, 3, 5, 8]

        // binarySearch: Searches for a specific value in the sorted array using binary
        // search
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("BinarySearch: " + index); // Output: BinarySearch: 2

        // fill: Assigns the specified value to every element of the array
        int[] filledArr = new int[5];
        Arrays.fill(filledArr, 10);
        System.out.println("Fill: " + Arrays.toString(filledArr)); // Output: Fill: [10, 10, 10, 10, 10]

        // copyOf: Creates a new array with the specified length and copies elements
        // from the original array
        int[] newArr = Arrays.copyOf(arr, 7);
        System.out.println("CopyOf: " + Arrays.toString(newArr)); // Output: CopyOf: [1, 2, 3, 5, 8, 0, 0]

        // equals: Compares two arrays for equality
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Equals: " + isEqual); // Output: Equals: true

        // asList: Converts an array into a fixed-size list
        String[] strArr = { "apple", "banana", "orange" };
        System.out.println("AsList: " + Arrays.asList(strArr)); // Output: AsList: [apple, banana, orange]

        // stream: Creates a stream of elements from the array
        Arrays.stream(arr).forEach(System.out::println); // Output: 1 2 3 5 8
    }
}
