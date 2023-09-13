
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        // 1. Create a HashMap with specified key-value pairs
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hari", 25);
        hashMap.put("Singh", 30);
        hashMap.put("Meena", 28);
        hashMap.put("Twinkle", 22);
        hashMap.put("palak", 35);

        // 2. Display the key and value of the HashMap
        System.out.println("HashMap key-value pairs:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // 3. Update the value of one of the keys in the HashMap
        String keyToUpdate = "Meena";
        int newValue = 29; // New age for Bob
        hashMap.put(keyToUpdate, newValue);

        // Display the updated HashMap
        System.out.println("\nUpdated HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
