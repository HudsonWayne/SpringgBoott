package Java.JCF.HashMap;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Add key-value pairs
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);

        // Access values using keys
        System.out.println("Alice's score: " + studentScores.get("Alice"));

        // Check if a key exists
        if (studentScores.containsKey("Bob")) {
            System.out.println("Bob's score is: " + studentScores.get("Bob"));
        }

        // Remove an entry
        studentScores.remove("Charlie");

        // Loop through the Map
        for (String name : studentScores.keySet()) {
            System.out.println(name + " → " + studentScores.get(name));
        }
    }
}
