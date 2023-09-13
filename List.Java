
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of String with at least 10 elements
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Grape");
        stringList.add("Fig");
        stringList.add("Lemon");
        stringList.add("Mango");
        stringList.add("Orange");
        stringList.add("Peach");

        // 1. Iterate through the ArrayList using Iterator
        System.out.println("Iterating through the ArrayList:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }

        // 2. Search for an element in the ArrayList
        String searchElement = "Grape";
        boolean found = stringList.contains(searchElement);
        System.out.println("\nSearching for '" + searchElement + "': " + (found ? "Found" : "Not Found"));

        // 3. Add 5 new elements and remove the first 5 elements
        stringList.add("Pear");
        stringList.add("Pineapple");
        stringList.add("Raspberry");
        stringList.add("Strawberry");
        stringList.add("Watermelon");

        for (int i = 0; i < 5; i++) {
            stringList.remove(0); // Remove the first element 5 times
        }

        // Print the updated ArrayList
        System.out.println("\nUpdated ArrayList:");
        for (String element : stringList) {
            System.out.println("Element: " + element);
        }
    }
}
