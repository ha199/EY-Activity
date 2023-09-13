
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterationWithDuplicates {
    public static void main(String[] args) {
        // Create a HashSet of String with at least 10 elements (including duplicates)
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Apple"); // Duplicate
        stringSet.add("Fig");
        stringSet.add("Lemon");
        stringSet.add("Mango");
        stringSet.add("Cherry"); // Duplicate
        stringSet.add("Orange");

        // Iterate through the HashSet using Iterator
        System.out.println("Iterating through the HashSet:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Element: " + element);
        }
    }
}
