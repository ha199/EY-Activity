
// 1. Write a Java program that will iterate through all elements in array with int data type atleast 10 elements. (Use any kind of loop)

public class Array {
    public static void main(String[] args) {
        // Define an array of int with at least 10 elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // You can add more elements

        // Iterate through the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}

//2. Using the Java program created from item 1, retrieve the first element and last element of the array list.

public class ArrayFirstLastElement {
    public static void main(String[] args) {
        // Define an array of int with at least 10 elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // You can add more elements

        // Retrieve the first element
        int firstElement = numbers[0];

        // Retrieve the last element
        int lastElement = numbers[numbers.length - 1];

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}

//3. Using the Java program created from item 1, update the 3rd and 8th element of the array.
public class ArrayUpdateElements {
    public static void main(String[] args) {
        // Define an array of int with at least 10 elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // You can add more elements

        // Update the 3rd element (index 2)
        numbers[2] = 30;

        // Update the 8th element (index 7)
        numbers[7] = 80;

        // Print the updated array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}


