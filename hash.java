import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 3);      // key = "apple", value = 3
        map.put("banana", 5);

        System.out.println(map.get("apple")); // Output: 3
    }
}
