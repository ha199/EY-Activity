
public class ArrayOperations {
    public static void main(String[] args) {
        // Define an array of int with at least 10 elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // You can add more elements

        // 1. Iterate through the array using a for loop
        System.out.println("Iterating through the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // 2. Retrieve the first and last element
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        System.out.println("\nFirst element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // 3. Update the 3rd element (index 2) and 8th element (index 7)
        numbers[2] = 30;
        numbers[7] = 80;
        System.out.println("\nUpdated array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
        
